package com.patil.practice;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 8, 0};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        if (count > 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }


    }
}
