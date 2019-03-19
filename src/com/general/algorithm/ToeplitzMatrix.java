package com.general.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 766. Toeplitz Matrix
 * status: pass
 */
public class ToeplitzMatrix {
    public static void main(String[] args) {

    }

    private static boolean isToeplitzMatrix(int[][] matrix) {
        int length1 = matrix.length;
        if(length1 == 1){
            return true;
        }
        for(int i=1;i<length1;i++){
            int[] newArr = matrix[i];
            int length2 = newArr.length;
            for(int j=1;j<length2;j++){
                if(newArr[j] != matrix[i-1][j-1]){
                   return false;
                }
            }
        }
        return true;
    }
}
