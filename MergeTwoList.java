package com.patil.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        Set<Integer> integers = new HashSet<>(list1);
        integers.addAll(list2);

        System.out.println("Merger List: " + integers);
    }
}
