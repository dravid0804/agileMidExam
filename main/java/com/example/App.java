package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            try {
                System.out.println("Factorial of " + num + " is: " + calculateFactorial(num));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

    public static long calculateFactorial(int num) {
        if (num < 0) throw new IllegalArgumentException("Factorial not defined for negative numbers.");
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
