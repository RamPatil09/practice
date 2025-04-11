package com.patil.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aabbccdeff";
        Map<Character, Integer> list = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            list.put(c, list.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : list.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repreated character: " + entry.getKey());
                break;
            }
        }
    }
}
