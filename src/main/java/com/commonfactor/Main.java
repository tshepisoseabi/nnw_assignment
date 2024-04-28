package com.commonfactor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        int n;
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer greater than 0:");
                }
            } else {
                System.out.println("Please enter an integer:");
                scanner.next();
            }
        }

        int[] numbersToBeDivided = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    numbersToBeDivided[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Please enter an integer:");
                    scanner.next();
                }
            }
        }

        int highestCommonFactor = highestCommonFactor(numbersToBeDivided);

        System.out.print("The highest common factor is: " + highestCommonFactor);

        scanner.close();
    }

    public static int highestCommonFactor(int[] numbers) {
        int cmf = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cmf = calculateCommonFactor(cmf, numbers[i]);
        }
        return cmf;
    }

    public static int calculateCommonFactor(int firstValue, int secondValue) {
        while (secondValue != 0) {
            int temp = secondValue;
            secondValue = firstValue % secondValue;
            firstValue = temp;
        }
        return firstValue;
    }
}
