package com.patil.practice;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is a popular programming language";
        String[] words = sentence.split(" ");
        System.out.println("Total Word Count: " + words.length);
    }
}
