package com.tasks.kyu7.myLanguages;

import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {

        List<String> result = results.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(x -> x.getValue()>=60)
                .map(x->x.getKey())
                .collect(Collectors.toList());
        return result;
    }
}
