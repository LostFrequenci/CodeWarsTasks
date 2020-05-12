package com.tasks.kyu6.duplicateEncoderTests;

import com.tasks.kyu6.duplicateEncoder.DuplicateEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class duplicateEncoderTestSuite {

    @Test
    public void duplicateTest1() {

        // Given
        String inputSentence = "Prespecialized";
        // When
        String outputSentence = DuplicateEncoder.encode(inputSentence);
        // Then
        assertEquals(")()())()(()()(", outputSentence);
    }

    @Test
    public void duplicateTest2() {

        // Given
        String inputSentence = "   ()(   ";
        // When
        String outputSentence = DuplicateEncoder.encode(inputSentence);
        // Then
        assertEquals("))))())))", outputSentence);
    }

    @Test
    public void duplicateTest3() {

        // Given
        String inputSentence =  "AAABCDEEEFGH";
        // When
        String outputSentence = DuplicateEncoder.encode(inputSentence);
        // Then
        assertEquals(")))((()))(((", outputSentence);
    }
}
