package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArrayTest {

    @Test
    void lowestValue() {
        assertEquals(1,SimpleArray.lowestValue());
    }

    @Test
    void bubbleSort(){
        int[] numArray={1,1,2,3,4,5,7,9,20};
        int[] resArray=SimpleArray.bubbleSort();
        assertEquals(0,Arrays.compare(numArray,resArray));
    }

    @Test
    void selectionSort(){
        int[] numArray={1,1,2,3,4,5,7,9,20};
        int[] resArray=SimpleArray.selectionSort();
        assertEquals(0,Arrays.compare(numArray,resArray));
    }
}