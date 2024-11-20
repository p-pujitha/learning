package org.pujitha.virtualthreads.loadtest;

import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class PlatformThreadTest {
//    private static final String SLEEP_API_URL_TEMPLATE = "http://100.24.233.246:8081/sleep?sleepTime=%d";
    private static final String SLEEP_API_URL_TEMPLATE = "http://localhost:8081/sleepcount?sleepTime=%d";


    private static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Usage: java PlatformThreadApiCalls <sleepTime> <messageLimit> <maxConcurrentCalls>");
            System.exit(1);
        }

        int sleepTime = Integer.parseInt(args[0]);
        int messageLimit = Integer.parseInt(args[1]);
        int maxConcurrentCalls = Integer.parseInt(args[2]);

        String sleepApiUrl = String.format(SLEEP_API_URL_TEMPLATE, sleepTime);
        ExecutorService executor = Executors.newFixedThreadPool(maxConcurrentCalls); // Fixed thread pool executor

        Instant start = Instant.now();

        for (int i = 0; i < messageLimit; i++) {
            executor.submit(() -> {
                callSleepApi(sleepApiUrl);

            });
        }

        executor.shutdown();
        try {
            if (executor.awaitTermination(10, TimeUnit.MINUTES)) {
                Instant end = Instant.now();
                System.out.println("Platform Threads: Time taken = " + Duration.between(start, end).toMillis() + " ms");
                System.out.println("Processed " + messageLimit + " messages using platform threads.");
            } else {
                System.err.println("Timeout occurred before all API calls were completed.");
            }
        } catch (InterruptedException e) {
            System.err.println("Error waiting for executor termination: " + e.getMessage());
        }
    }

    private static void callSleepApi(String url) {
        try {
            restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            System.err.println("Error calling sleep API: " + e.getMessage());
        }
    }
}


