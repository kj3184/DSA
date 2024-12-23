package org.dsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class Fibonacci_recursionTest {


    @Test
    void fibonacci_rec() {
//        Fibonacci_recursion.fibonacci_rec(1,0);
    }

    @Test
    void fibonacci_rec2() {
        assertEquals(4181,Fibonacci_recursion.fibonacci_rec2(19));
    }
}
