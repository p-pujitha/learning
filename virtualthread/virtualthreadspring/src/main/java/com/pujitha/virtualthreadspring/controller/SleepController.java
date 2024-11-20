package com.pujitha.virtualthreadspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleepController {

    @GetMapping("/sleep")
    public String sleep(@RequestParam(defaultValue = "1000") long sleepTime) {
        try {
            // Simulate processing time by sleeping for the specified duration
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
            return "Sleep was interrupted!";
        }

        return "Slept for " + sleepTime + " milliseconds!";
    }
}