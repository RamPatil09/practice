package com.patil.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class ThirdRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aabbcdeff";

        Map<Character, Integer> list = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            list.put(c, list.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry : list.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
                if (count == 3) {
                    System.out.println("Third repeated character: " + entry.getKey());
                    break;
                }
            }
        }

        if (count < 3) {
            System.out.println("No third repeated character found.");
        }
    }
}
