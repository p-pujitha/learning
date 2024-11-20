package org.pujitha.virtualthreads.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class KafkaConsumerVirtualThreads {

    private static final String TOPIC_NAME = "my-topic";
    private static final String BOOTSTRAP_SERVERS = "localhost:9092";
    private static final String SLEEP_API_URL = "http://localhost:8081/sleep?sleepTime=1000";

    // Increase this value for load testing
    private static final int MESSAGE_LIMIT = 10000; // Total number of messages to process

    private static final RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "virtual-group");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Collections.singletonList(TOPIC_NAME));

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor(); // Virtual threads executor

        Instant start = Instant.now();
        int processedMessages = 0;

        while (processedMessages < MESSAGE_LIMIT) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
            for (ConsumerRecord<String, String> record : records) {
                executor.submit(KafkaConsumerVirtualThreads::callSleepApi);
                processedMessages++;
                if (processedMessages >= MESSAGE_LIMIT) break;
            }
        }

        executor.shutdown();
        try {
            if (executor.awaitTermination(10, TimeUnit.MINUTES)) {
                Instant end = Instant.now();
                System.out.println("Virtual Threads: Time taken = " + Duration.between(start, end).toMillis() + " ms");
                System.out.println("Processed " + MESSAGE_LIMIT + " messages using virtual threads.");
            } else {
                System.err.println("Timeout occurred before all API calls were completed.");
            }
        } catch (InterruptedException e) {
            System.err.println("Error waiting for executor termination: " + e.getMessage());
        }
    }

    private static void callSleepApi() {
        try {
            restTemplate.getForObject(SLEEP_API_URL, String.class);
        } catch (Exception e) {
            System.err.println("Error calling sleep API: " + e.getMessage());
        }
    }
}
