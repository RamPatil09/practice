package com.patil.practice;

public class TotalCharCount {
    public static void main(String[] args) {
        String str = "Ramangoud";
        String str1 = "I am a developer ";

        System.out.println(withoutSpace(str));
        System.out.println(withSpace(str1));
        System.out.println(excludeSpace(str1));
    }

    public static int withoutSpace(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }

    public static int withSpace(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            count++;
        }
        return count;
    }

    public static int excludeSpace(String string) {
        String str = string.replaceAll(" ", "");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }
}


