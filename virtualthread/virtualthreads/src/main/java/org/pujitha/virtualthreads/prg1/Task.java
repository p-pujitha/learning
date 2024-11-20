package org.pujitha.virtualthreads.prg1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class Task {
    private static Logger log = LoggerFactory.getLogger(Task.class);

    public static void  doIntensive(int i){
        try {
            log.info("Starting I/O task {}", i);
            Thread.sleep(Duration.ofSeconds(10));
            log.info("Ending I/O task {}", i);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
