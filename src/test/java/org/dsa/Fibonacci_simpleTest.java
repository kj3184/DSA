package org.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Fibonacci_simpleTest {

    @Test
    void fibonacci() {
        assertEquals(4181, Fibonacci_simple.fibonacci());
    }
}
