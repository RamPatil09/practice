package com.patil.practice;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime number between 0 to 100.");
        for (int i = 2; i < 100; i++) {
            if (primeNum(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean primeNum(int num) {
        if (num < 2) return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
