package org.dsa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class RunningSumArrayTest {

    @Test
    void minStartingValue() {
        List<Integer> nums = List.of(-4, 3, 2, 1);

        assertEquals(5, RunningSumArray.minStartingValue(nums));
    }
}
