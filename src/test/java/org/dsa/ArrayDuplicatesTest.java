package org.dsa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ArrayDuplicatesTest {

    @Test
    void findDuplicates() {
        List<Integer> resList = new ArrayList<Integer>();
        resList.add(2);
        resList.add(3);
        int[] arr = {2, 3, 1, 2, 3};
        assertEquals(resList, ArrayDuplicates.findDuplicates(arr));
        List<Integer> resList1 = new ArrayList<Integer>();
        int[] arr1 = {0, 3, 1, 2};
        assertEquals(resList1, ArrayDuplicates.findDuplicates(arr1));
        List<Integer> resList2 = new ArrayList<Integer>();
        int[] arr2 = {2};
        assertEquals(resList2, ArrayDuplicates.findDuplicates(arr2));
    }
}
