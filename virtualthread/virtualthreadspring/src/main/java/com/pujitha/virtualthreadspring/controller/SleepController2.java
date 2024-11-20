package com.pujitha.virtualthreadspring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class SleepController2 {

    private final AtomicInteger requestCount = new AtomicInteger(0);

    @GetMapping("/sleepcount")
    public String sleep(@RequestParam(defaultValue = "1000") long sleepTime) {
        requestCount.incrementAndGet(); // Increment request count

        try {
            // Simulate processing time by sleeping for the specified duration
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
            return "Sleep was interrupted!";
        }

        return "Slept for " + sleepTime + " milliseconds!";
    }

    @GetMapping("/request-count")
    public String getRequestCount() {
        return "Total requests processed: " + requestCount.get();
    }
}