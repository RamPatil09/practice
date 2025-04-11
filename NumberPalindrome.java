package com.patil.practice;


public class NumberPalindrome {
    public static void main(String[] args) {

        int num = 131;
        int rev = 0;
        int rem;
        int temp = num;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println(num + ": is Palindrome");
        } else {
            System.out.println(num + ": is not a Palindrome");
        }
    }
}
