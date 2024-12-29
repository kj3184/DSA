package org.dsa;

public class Fibonacci_recursion {

    static int count = 2;

    public static void fibonacci_rec(int prev1, int prev2) {
        int fibo_num = 0;
        if (count <= 19) {
            fibo_num = prev2 + prev1;
            System.out.println(fibo_num);
            prev2 = prev1;
            prev1 = fibo_num;
            count++;
            fibonacci_rec(prev1, prev2);
        } else return;
    }

    public static int fibonacci_rec2(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci_rec2(num - 1) + fibonacci_rec2(num - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        Fibonacci_recursion.fibonacci_rec(1, 0);
        Fibonacci_recursion.fibonacci_rec2(19);
    }
}
