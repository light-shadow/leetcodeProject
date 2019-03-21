package com.general.algorithm;

import java.util.Arrays;

/**
 * 908. Smallest Range I
 * status: pass
 */
public class SmallestRangeI {

    public static void main(String[] args) {

    }

    public static int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        if(Math.abs(A[0] - A[A.length-1])<=2*K){
            return 0;
        }
        else{
            return (A[A.length-1]-K) - (A[0]+K) ;
        }

    }
}
