package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Fibonacci_simpleTest {


    @Test
    void fibonacci() {
        assertEquals(4181,Fibonacci_simple.fibonacci());
    }
}

//0,1,1,2,3,5,8