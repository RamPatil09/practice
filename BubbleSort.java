package com.patil.practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {4, 12, 86, -54, 8, -124};
        int temp;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
