package com.patil.practice;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "GADAG";
       StringBuilder rev = new StringBuilder();
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        if (rev.toString().equals(str)) {
            System.out.println(str + ": is Palindrome");
        } else {
            System.out.println(str + ": is not a Palindrome");
        }
    }
}
