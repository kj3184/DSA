package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumArrayTest {

    @Test
    void minStartingValue() {
        List<Integer> nums = List.of(-4,3,2,1);

        assertEquals(5,RunningSumArray.minStartingValue(nums));
    }
}