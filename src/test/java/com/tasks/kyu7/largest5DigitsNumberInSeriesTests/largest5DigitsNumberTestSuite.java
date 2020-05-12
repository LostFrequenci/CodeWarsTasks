package com.tasks.kyu7.largest5DigitsNumberInSeriesTests;

import com.tasks.kyu7.largest5DigitsNumberInSeries.LargestFiveDigitNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class largest5DigitsNumberTestSuite {
    @Test
    public void numberTest1() {

        // Given
        String inputNumber = "283910";

        // When
        int outputNumber = LargestFiveDigitNumber.solve(inputNumber);

        // Then
        assertEquals(outputNumber,83910);
    }

    @Test
    public void numberTest2() {

        // Given
        String inputNumber = "1234567890";

        // When
        int outputNumber = LargestFiveDigitNumber.solve(inputNumber);

        // Then
        assertEquals(outputNumber,67890);
    }
}
