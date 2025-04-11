package com.patil.practice;

public class SecondLargetNumber {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int larget = Integer.MIN_VALUE, secondLarget = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > larget) {
                secondLarget = larget;
                larget = num;
            } else if (num > secondLarget && num != larget) {
                secondLarget = num;
            }
        }
        System.out.println("Seconf Larget: " + secondLarget);
    }
}
