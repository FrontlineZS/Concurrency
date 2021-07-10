package com.frontline.concurrency;

import java.util.Scanner;

/**
 * Creating clear, correct and well documented concurrent programs
 * by FrontlineZS
 */
public class ConcurrencyApplication {
    private static final String SEPARATOR = " ";

    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            final int queries = scanner.nextInt();

            for (int i = 0; i < queries; i++) {
                final int a = scanner.nextInt();
                final int b = scanner.nextInt();
                final int n = scanner.nextInt();

                for (int j = 0; j < n; j++) {
                    System.out.print(generateNextElementOfSequence(a, b, j) + SEPARATOR + (j + 1 == n ? "\n" : ""));
                }
            }
        }
    }

    private static int generateNextElementOfSequence(int a, int b, int n) {
        if (n == 0) return a + (int) Math.pow(2, n) * b;

        return generateNextElementOfSequence(a, b, n - 1) + (int) Math.pow(2, n) * b;
    }
}
