package com.general.algorithm;

/**
 * 633. Sum of Square Numbers
 */
public class SumofSquareNumbers {

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(4));
    }

    public static boolean judgeSquareSum(int c) {
        double root = Math.sqrt(c);
        int _root = (int)root;
        int square;
        boolean flag = false;
        for(int i=0;i<=_root;i++){
            for(int j=0;j<=_root;j++){
                square = i*i + j*j;
                if(square == c){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
