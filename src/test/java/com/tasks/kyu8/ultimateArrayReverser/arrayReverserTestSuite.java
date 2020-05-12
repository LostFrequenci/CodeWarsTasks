package com.tasks.kyu8.ultimateArrayReverser;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class arrayReverserTestSuite {
    @Test
    public void reverserTest1(){
        //Given
        String[] inputSentence = new String[]{"I", "like", "big", "butts", "and", "I", "cannot", "lie!"};

        //When
        String[] outputSentence = UltimateArrayReverser.reverse(inputSentence);

        //Then
        assertEquals(outputSentence,new String[]{"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"});
    }
    @Test
    public void reverserTest2(){
        //Given
        String[] inputSentence = new String[]{"?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH"};

        //When
        String[] outputSentence = UltimateArrayReverser.reverse(inputSentence);

        //Then
        assertEquals(outputSentence,new String[]
                {"How", "many", "shrimp", "do", "you", "have", "to", "eat",
                        "before", "your", "skin", "starts", "to", "turn", "pink?"});
    }
}
