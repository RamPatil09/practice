package com.patil.practice;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dabc";

        if (isRotation(str1, str2)) {
            System.out.println("String is rotation of each other");
        } else {
            System.out.println("Strings are not rotation of each other");
        }
    }

    public static boolean isRotation(String str, String str1) {
        if (str.length() != str1.length()) return false;
        String combined = str + str;
        return combined.contains(str1);
    }
}
