package com.tasks.ultimateArrayReverser;

public class UltimateArrayReverser {

        public static String[] reverse(String[] a) {
            int [] nrLetters = new int[a.length];
            String [] result = new String[a.length];
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i < a.length; i++) {
                sb.append(a[i]);
                nrLetters[i] = a[i].length();
            }
            String str = sb.reverse().toString();
            int begin = 0;

            for(int i = 0; i < result.length; i++) {
                result[i] = str.substring(begin,begin + nrLetters[i]);
                begin += nrLetters[i];
            }
            return result;
        }
}

