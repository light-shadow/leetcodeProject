package com.general.algorithm;

import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array
 * status: pass
 */
public class SquaresOfASortedArray {

    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] A) {
        int[] newArr = new int[A.length];
        int index= 0;
        for(int each: A){
            newArr[index] = each*each;
            index++;
        }
        Arrays.sort(newArr);
        return newArr;
    }
}
