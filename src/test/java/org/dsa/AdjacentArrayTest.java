package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentArrayTest {

    @Test
    void largestNumber() {
        assertEquals("9758601",AdjacentArray.largestNumber("7596801"));
        assertEquals("9756",AdjacentArray.largestNumber("7596"));
    }
}


