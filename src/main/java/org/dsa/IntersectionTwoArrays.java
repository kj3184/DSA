package org.dsa;

import java.util.*;

public class IntersectionTwoArrays {
    public static ArrayList<Integer> intersectionWithoutDuplicates(int[] a, int[] b) {
        Set<Integer> resultSet=new HashSet<>();
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    resultSet.add(i);
                    break;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
