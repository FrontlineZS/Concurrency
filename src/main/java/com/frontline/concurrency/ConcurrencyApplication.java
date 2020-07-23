package com.frontline.concurrency;

import java.util.Scanner;

/**
 * Creating clear, correct and well documented concurrent programs
 * by FrontlineZS
 */
public class ConcurrencyApplication {
    private static final int AMOUNT_OF_ITERATION = 10;

    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            final int integerToBeMultiple = scanner.nextInt();

            for (int i = 1; i <= AMOUNT_OF_ITERATION; i++) {
                System.out.printf("%d x %d = %d\n", integerToBeMultiple, i, integerToBeMultiple * i);
            }
        }
    }
}
