package com.tasks.kyu8.sortOutTheMenFromBoys;

import java.util.*;

public class MenFromBoysSorter {
    public static int[] menFromBoys(final int[] values) {
        ArrayList<Integer> boys = new ArrayList<>();
        ArrayList<Integer> men = new ArrayList<>();
        for (int i = 0; i<values.length; i++) {
            if ( values[i] % 2 == 0 ) { men.add(values[i]);
            } else { boys.add(values[i]);}
        }
        Collections.sort(men);
        Collections.sort(boys, Collections.reverseOrder());
        men.addAll(boys);
        int[] result = men.stream().distinct().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
