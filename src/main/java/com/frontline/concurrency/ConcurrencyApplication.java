package com.frontline.concurrency;

import java.util.Scanner;

/**
 * Creating clear, correct and well documented concurrent programs
 * by FrontlineZS
 */
public class ConcurrencyApplication {

    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            printSeparatingLine();

            for (int i = 0; i < 3; i++) {
                System.out.printf("%-15s%03d\n", scanner.next(), scanner.nextInt());
            }

            printSeparatingLine();
        }
    }

    private static void printSeparatingLine() {
        System.out.println("================================");
    }
}
