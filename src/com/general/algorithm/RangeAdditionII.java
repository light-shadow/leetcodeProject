package com.general.algorithm;

/**
 * 598. Range Addition II
 * status: todo
 */
public class RangeAdditionII {

    public static void main(String[] args) {

    }

    public int maxCount(int m, int n, int[][] ops) {
        int[][] array = new int[m][n];
        for(int i=0;i<array.length;i++){
            int[] each = array[i];
            for(int j=0;j<each.length;j++){
                array[i][j] = 0;
            }
        }
        for(int i=0;i<ops.length;i++){
            int[] each2 = ops[i];

        }
        return 0;

    }
}
