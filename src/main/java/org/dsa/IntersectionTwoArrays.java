package org.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public static ArrayList<Integer> intersectionWithoutDuplicates(final int[] a, final int[] b) {
        Set<Integer> resultSet = new HashSet<Integer>();
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
