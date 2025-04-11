package com.patil.practice.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "JPA");

        Predicate<String> startsWithJ = name -> name.startsWith("J");

        names.stream()
                .filter(startsWithJ)
                .forEach(System.out::println);
    }
}
