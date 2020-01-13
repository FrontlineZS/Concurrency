package com.frontline.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Creating clear, correct and well documented concurrent programs
 */
public class ConcurrencyApplication {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;

            while (!stopRequested) {                    // Ad. 2
                i++;
            }

            System.out.println(i);
        });

        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;                           // Ad. 1
    }

}
