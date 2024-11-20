package org.pujitha.virtualthreads.prg1;

import java.util.concurrent.CountDownLatch;

public class InboundOutboundTaskDemo {
    private static final int MAX_PLATFORM = 10;
//    private static final int MAX_PLATFORM = 50000;
//private static final int MAX_VIRTUAl = 10;
//    private static final int MAX_VIRTUAl = 50000;
private static final int MAX_VIRTUAl = 200_000;




    public static void main(String[] args) throws InterruptedException {
        platFormThreadDemo3();
//        virtualThreadDemo();
    }

    private static void platFormThreadDemo1() {
        for (int i = 1; i <= MAX_PLATFORM; i++) {
            int j = i;
            Thread thread = new Thread(() -> {
                Task.doIntensive(j);
            });
            thread.start();
        }
    }

    private static void platFormThreadDemo2() {
        Thread.Builder.OfPlatform builder = Thread.ofPlatform().name("pujitha", 1);
        for (int i = 1; i <= MAX_PLATFORM; i++) {
            int j = i;
            Thread thread = builder.unstarted(() -> Task.doIntensive(j));
            thread.start();

        }
    }
    //daemon -> works at background
    private static void platFormThreadDemo3() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(MAX_PLATFORM);
        Thread.Builder.OfPlatform builder = Thread.ofPlatform().daemon().name("daemon", 1);
        for (int i = 1; i <= MAX_PLATFORM; i++) {
            int j = i;
            Thread thread = builder.unstarted(() -> {
                Task.doIntensive(j);
                countDownLatch.countDown();
            });
            thread.start();

        }
        countDownLatch.await();
    }


    // virtual threads are daemon by default.
    private static void virtualThreadDemo() throws InterruptedException {
        var countDownLatch = new CountDownLatch(MAX_VIRTUAl);
        Thread.Builder.OfVirtual builder = Thread.ofVirtual().name("virtual-",1);
        for (int i = 1; i <= MAX_VIRTUAl; i++) {
            int j = i;
            Thread thread = builder.unstarted(() -> {
                Task.doIntensive(j);
                countDownLatch.countDown();
            });
            thread.start();
        }
        countDownLatch.await();

    }
}
