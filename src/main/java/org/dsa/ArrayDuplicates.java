package org.dsa;

import java.util.*;

public class ArrayDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> resList = new ArrayList<>();
        Set<Integer> duplicateNum = new HashSet<>();
        for (int num : arr) {
            if (!duplicateNum.add(num)) {
                resList.add(num);
            }
        }
        return resList;
    }
}
