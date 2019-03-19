package com.general.algorithm;

import java.util.*;

/**
 * 922. Sort Array By Parity II
 * status: pass
 */
public class SortArrayByParityII {

    public static void main(String[] args) {

    }

    public int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        Stack<Integer> evenList = new Stack<>();
        Stack<Integer> oddList = new Stack<>();
        for(int each: A){
            if(isEven(each)){
                evenList.add(each);
            }
            else{
                oddList.add(each);
            }
        }
        int[] newArr = new int[length];
        for(int i=0;i<length;i++){
            if(i%2==0){
                newArr[i] = evenList.pop();
            }
            else{
                newArr[i] = oddList.pop();
            }
        }
        return newArr;


    }

    public boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
}
