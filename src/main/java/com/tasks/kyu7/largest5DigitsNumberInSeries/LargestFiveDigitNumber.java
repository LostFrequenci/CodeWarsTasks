package com.tasks.kyu7.largest5DigitsNumberInSeries;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        if ( digits.length()<6 ) {
            return Integer.parseInt(digits);
        } else {
            int result = 0;
            for (int i = 0; i < digits.length()-4; i++) {
                if ( result < Integer.parseInt(digits.substring(i,5+i))) {
                    result = Integer.parseInt(digits.substring(i,5+i));
                }
            }
            return result;
        }
    }
}
