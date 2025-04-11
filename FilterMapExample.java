package com.patil.practice.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("JAVA", "spring", "BOOT", "Advance");

        List<String> filtered = names.stream().filter(name -> name.equals(name.toUpperCase())).collect(Collectors.toList());

        System.out.println(filtered);
    }
}
