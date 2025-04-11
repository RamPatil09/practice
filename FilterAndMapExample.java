package com.patil.practice.map;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Ramangoud","Omkar");

        names.stream()
                .filter(name->name.length()>5)
                .forEach(name-> System.out.println(name));

    }
}