package com.tasks.kyu6.duplicateEncoderTests;

import com.tasks.kyu6.duplicateEncoder.DuplicateEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class duplicateEncoderTestSuite {

    @Test
    public void duplicateTest1() {

        // When
        String inputSentence = "Prespecialized";
        // Given
        String outputSentence = DuplicateEncoder.encode(inputSentence);
        // Then
        assertEquals(")()())()(()()(", outputSentence);
    }

    @Test
    public void duplicateTest2() {

        // When
        String inputSentence = "   ()(   ";
        // Given
        String outputSentence = DuplicateEncoder.encode(inputSentence);
        // Then
        assertEquals("))))())))", outputSentence);
    }

    @Test
    public void duplicateTest3() {

        // When
        String inputSentence =  "AAABCDEEEFGH";
        // Given
        String outputSentence = DuplicateEncoder.encode(inputSentence);
        // Then
        assertEquals(")))((()))(((", outputSentence);
    }
}
