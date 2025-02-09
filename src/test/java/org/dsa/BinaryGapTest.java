package org.dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryGapTest {

    @Test
    void binaryGap() {
        assertEquals(5, BinaryGap.binaryGap(1041));
        assertEquals(0, BinaryGap.binaryGap(32));
    }
}
