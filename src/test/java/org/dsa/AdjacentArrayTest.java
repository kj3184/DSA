package org.dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdjacentArrayTest {

    @Test
    void largestNumber() {
        assertEquals("9758601", AdjacentArray.largestNumber("7596801"));
        assertEquals("9756", AdjacentArray.largestNumber("7596"));
        assertEquals("54321", AdjacentArray.largestNumber("12345"));
    }
}
