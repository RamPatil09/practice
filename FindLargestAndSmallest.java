package com.patil.practice;

import java.util.Arrays;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 70, 1};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
