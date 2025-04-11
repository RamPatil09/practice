package com.patil.practice;

import java.util.*;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<String> names = Arrays.asList("Ram", "Raghu", "Raman", "Ram");
        Set<Integer> uniqueNums = new HashSet<>(nums);
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Unique number: " + uniqueNums);
        System.out.println("Unique names: " + uniqueNames);
    }
}
