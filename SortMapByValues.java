package com.patil.practice;

import java.util.*;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 5);
        map.put("C", 15);

       List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
       list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
       for (Map.Entry<String,Integer> entries: list){
           System.out.println(entries.getKey()+"->"+entries.getValue());
       }
    }
}
