package org.dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondLargestNumberTest {

    @Test
    void secondLargest() {
        assertEquals(5, SecondLargestNumber.secondLargest(new int[] {10, 5, 10}));
        assertEquals(34, SecondLargestNumber.secondLargest(new int[] {12, 35, 1, 10, 34, 1}));
        assertEquals(-1, SecondLargestNumber.secondLargest(new int[] {10, 10, 10}));
        assertEquals(
                28078,
                SecondLargestNumber.secondLargest(
                        new int[] {28078, 19451, 935, 28892, 2242, 3570, 5480, 231}));
    }
}
