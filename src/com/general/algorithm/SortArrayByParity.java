package com.general.algorithm;

/**
 * 905. Sort Array By Parity
 * status: pass
 */
public class SortArrayByParity {
    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] A) {
        int length  = A.length;
        int[] newArr = new int[length];
        int leftIndex = 0;
        int rightIndex = length - 1;
        for(int each: A){
            if(isEven(each)){
                newArr[leftIndex] = each;
                leftIndex++;
            }
            else{
                newArr[rightIndex] = each;
                rightIndex--;
            }
        }
        return newArr;

    }

    public static boolean isEven(int number){
        if(number%2 == 0){
            return true;
        }
        return false;
    }
}
