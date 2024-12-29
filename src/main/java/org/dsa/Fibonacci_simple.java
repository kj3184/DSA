package org.dsa;

public class Fibonacci_simple {

    public static int fibonacci() {
        int prev2 = 0;
        int prev1 = 1;
        int fib_number = 0;
        for (int i = 2; i < 20; i++) {
            fib_number = prev2 + prev1;
            prev2 = prev1;
            prev1 = fib_number;
        }
        return fib_number;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci());
    }
}
