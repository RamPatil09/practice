package com.patil.practice.map;

import java.util.HashMap;
import java.util.Map;

public class SortmapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 8);
        map.put("Spring", 5);
        map.put("Hibernate", 7);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
