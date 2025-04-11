package com.patil.practice;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 1, 4, 2};
        int n = nums.length;

        int expectedSum = ((n + 1) * (n + 2)) / 2;

        for (int num : nums) {
            expectedSum -= num;
        }

        System.out.println(expectedSum);
    }
}
