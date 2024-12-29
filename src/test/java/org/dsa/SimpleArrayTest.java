package org.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SimpleArrayTest {

    @Test
    void lowestValue() {
        assertEquals(1, SimpleArray.lowestValue());
    }

    @Test
    void bubbleSort() {
        int[] numArray = {1, 1, 2, 3, 4, 5, 7, 9, 20};
        int[] resArray = SimpleArray.bubbleSort();
        assertEquals(0, Arrays.compare(numArray, resArray));
    }

    @Test
    void selectionSort() {
        int[] numArray = {1, 1, 2, 3, 4, 5, 7, 9, 20};
        int[] resArray = SimpleArray.selectionSort();
        assertEquals(0, Arrays.compare(numArray, resArray));
    }
}
