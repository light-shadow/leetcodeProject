package com.general.algorithm;

public class FlippingAnImage {

    public static void main(String[] args) {
//        System.out.println(0^0);
        int[][] arrays = new int[][]{
                {1,1,0},{1,0,1},{0,0,0}
        };
        flipAndInvertImage(arrays);

        int[][] arrays1 = new int[][]{
                {1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}
        };
        flipAndInvertImage(arrays1);
    }

    private static int[][] flipAndInvertImage(int[][] A) {
        int[][] arrays = new int[A.length][];
        for(int i=0;i<A.length;i++){
            int[] each = reverseArray(A[i]);
            arrays[i] = each;
        }
        for (int[] each: arrays) {
            for (int num: each) {
                System.out.println(num);
            }
            System.out.println("-----------");
        }
        System.out.println("-----------------------------------------------------------------");
        return  arrays;
    }

    private static int[] reverseArray(int[] arr){
        int length = arr.length;
        int[] newArr = new int[length];
        for(int i=length-1;i>=0;i--){
            newArr[length-i-1] = arr[i];
            newArr[length-i-1] ^= 1;
        }
        return newArr;
    }
}
