package com.frontline.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Creating clear, correct and well documented concurrent programs
 */
public class ConcurrencyApplication {
    volatile private static boolean stopRequested;              // Ad. 4
    private static long nextSerialNumber = 0;                   // Ad. 6
    private static final AtomicLong nextAtomicSerialNumber =    // Ad. 7
        new AtomicLong();

    synchronized private static long generateSerialNumber() {   // Ad. 5
        return nextSerialNumber++;
    }

    private static long generateAtomicSerialNumber() {
        return nextAtomicSerialNumber.getAndIncrement();
    }

    synchronized private static void setStopRequested() {
        ConcurrencyApplication.stopRequested = true;
    }                                                           // Ad. 3

    synchronized private static boolean isStopRequested() {
        return ConcurrencyApplication.stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;

            while (!stopRequested) {                            // Ad. 2
                i++;
            }

            System.out.println(i);
        });

        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;                                   // Ad. 1
    }

}
