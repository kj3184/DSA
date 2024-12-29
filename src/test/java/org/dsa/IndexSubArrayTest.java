package org.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class IndexSubArrayTest {

    @Test
    void subArraySum() {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        resList.add(2);
        resList.add(6);
        int[] arr = {12, 18, 5, 11, 30, 5};
        int target = 69;
        assertEquals(resList, IndexSubArray.subArraySum(arr, target));
    }
}
