package com.general.algorithm;

/**
 * 509. Fibonacci Number
 * status： pass
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(4));

    }

    public static int fib(int N) {
        if(N == 0 ){
            return 0;
        }
        else if(N ==1){
            return 1;
        }
        else{
            return fib(N-1) + fib(N-2);
        }
    }
}
