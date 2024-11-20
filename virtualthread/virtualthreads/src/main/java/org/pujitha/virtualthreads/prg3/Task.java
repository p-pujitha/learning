package org.pujitha.virtualthreads.prg3;

import org.pujitha.virtualthreads.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task {

    private static final Logger log = LoggerFactory.getLogger(Task.class);

    public static void cpuIntensive(int i){
        log.info("starting CPU task. Thread Info: {}", Thread.currentThread());
        var timeTaken = CommonUtil.timer(() -> findFib(i));
        log.info("ending CPU task. time taken: {} ms", timeTaken);
    }


    // 2 ^ N algorithm - intentionally done this way to simulate CPU intensive task
    public static long findFib(long input){
        if(input < 2)
            return input;
        return findFib(input - 1) + findFib(input - 2);
    }

}
