package com.patil.practice;

public class StringDuplication {
    public static void main(String[] args) {
        String str = "This this is is done by me";
        String[] string = str.split(" ");

        for (int i = 0; i < string.length; i++) {
            int count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i].equals(string[j])) {
                    count++;
                    string[j] = "0";
                }
            }
            if (string[i] != "0") {
                System.out.println(string[i] + " " + count);
            }
        }
    }

}
