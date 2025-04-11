package com.patil.practice.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Alex", "Chris");

        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Ascending: " + names);

        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Descending: " + names);
    }
}
