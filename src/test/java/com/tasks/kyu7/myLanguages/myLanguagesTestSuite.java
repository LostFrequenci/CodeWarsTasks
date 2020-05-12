package com.tasks.kyu7.myLanguages;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class myLanguagesTestSuite {
    @Test
    public void basicTest1() {
        // Given
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);

        // When
        List<String> outputList = MyLanguages.myLanguages(map1);

        //Then
        assertEquals(Arrays.asList("Ruby", "Python"), outputList);
    }

    public void basicTest2() {
        // Given
        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);

        // When
        List<String> outputList = MyLanguages.myLanguages(map2);

        //Then
        assertEquals(Arrays.asList("Dutch", "Greek", "Hindi"), outputList);
    }

    public void basicTest3() {
        // Given
        final Map<String, Integer> map3 = new HashMap<>();
        map3.put("C++", 50);
        map3.put("ASM", 10);
        map3.put("Haskell", 20);

        // When
        List<String> outputList = MyLanguages.myLanguages(map3);

        //Then
        assertEquals(Arrays.asList(), outputList);
    }
}
