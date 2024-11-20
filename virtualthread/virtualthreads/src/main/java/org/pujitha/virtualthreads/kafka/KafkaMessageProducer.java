package org.pujitha.virtualthreads.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class KafkaMessageProducer {

    public static void main(String[] args) {
        String topicName = "my-topic";  // Replace with your Kafka topic name
        String bootstrapServers = "localhost:9092";  // Replace with your Kafka broker address

        // Set Kafka producer properties
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // Create Kafka producer
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        try {
            for (int i = 1; i <= 100000; i++) {
                String messageKey = "Key" + i;
                String messageValue = "Message number " + i;

                ProducerRecord<String, String> record = new ProducerRecord<>(topicName, messageKey, messageValue);

                Future<RecordMetadata> future = producer.send(record, (metadata, exception) -> {
                    if (exception != null) {
                        System.err.println("Error sending message: " + exception.getMessage());
                    } else {
                        System.out.printf("Sent message with key %s to partition %d with offset %d%n",
                                messageKey, metadata.partition(), metadata.offset());
                    }
                });

                // Wait for message to be acknowledged (optional, use this if you want to confirm all messages are sent)
                future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Exception while sending messages: " + e.getMessage());
        } finally {
            producer.close();
        }

        System.out.println("All messages sent to topic " + topicName);
    }
}
