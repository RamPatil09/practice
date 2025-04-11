package com.patil.practice;

public class FabonacciSeries {
    public static void main(String[] args) {
        int count = 10;
        int previous = 0;
        int next = 1;
        int present;

        System.out.println(previous);

        for (int i = 0; i < count; i++) {
            present = previous + next;
            System.out.println(present);
            previous = next;
            next = present;
        }


    }
}
