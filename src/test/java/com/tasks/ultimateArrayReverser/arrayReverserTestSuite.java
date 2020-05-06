package com.tasks.ultimateArrayReverser;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class arrayReverserTestSuite {
    @Test
    public void testTaskAdd(){
        //Given


        //When


        //Then
    }
    @Test
    public void reverserTest1()
    {
        assertEquals(new String[]{"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"},
                UltimateArrayReverser.reverse(new String[]{"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}));
    }
    @Test
    public void FixedTest2()
    {
        assertEquals(new String[]
                        {"How", "many", "shrimp", "do", "you", "have", "to", "eat",
                                "before", "your", "skin", "starts", "to", "turn", "pink?"},
                UltimateArrayReverser.reverse(new String[]{"?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH"}));
    }
}
