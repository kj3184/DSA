package org.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class IntersectionTwoArraysTest {

    @Test
    void intersectionWithoutDuplicates() {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        resList.add(1);
        resList.add(3);
        int[] a = {1, 2, 1, 3, 1};
        int[] b = {3, 1, 3, 4, 1};
        assertEquals(resList, IntersectionTwoArrays.intersectionWithoutDuplicates(a, b));
    }
}
