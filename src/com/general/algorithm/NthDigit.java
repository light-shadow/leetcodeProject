package com.general.algorithm;

/**
 * 400. Nth Digit
 */
public class NthDigit {

    public static void main(String[] args) {
        System.out.println(findNthDigit(3));
    }

    public static int findNthDigit(int n) {
        StringBuilder sb = new StringBuilder("");
        int max = Integer.MAX_VALUE;
        for(int i=1;i<max;i++){
            sb.append(i);
        }
        return Integer.valueOf(sb.toString().substring(n-1, n));
    }
}
