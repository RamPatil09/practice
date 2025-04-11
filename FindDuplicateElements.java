package com.patil.practice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 5};
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num : arr) {
            if (!unique.add(num)) {
                duplicate.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicate);
    }
}
