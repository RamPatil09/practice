package com.patil.practice;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {
    public static void main(String[] args) {
        String str = "character";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
            System.out.println(entries.getKey() + " " + entries.getValue());
        }
    }
}
