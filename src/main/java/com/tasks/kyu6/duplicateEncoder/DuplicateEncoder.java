package com.tasks.kyu6.duplicateEncoder;

public class DuplicateEncoder {
     public static String encode(String word){

         StringBuilder result = new StringBuilder();
         char [] letters = word.toLowerCase().toCharArray();
         for (int i=0; i<letters.length; i++) {
             int marker = 0;
             for (int j = 0; j < letters.length; j++) {
                 if (j != i & letters[i] == letters[j]) {
                         marker += 1;
                 }
             }
             if (marker > 0) { result.append(')');
             } else { result.append('(');
             }
         }
        return result.toString();
    }
}
