package com.patil.practice;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 4, 3};

        Map<Integer, Integer> freqCount = new HashMap<>();

        for (int num : arr) {
            freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0, mostFrequentNum = -1;
        for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentNum = entry.getKey();
            }
        }
        System.out.println("Most frequemt num: " + mostFrequentNum);
    }
}
