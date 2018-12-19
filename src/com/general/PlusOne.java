package com.general;

/**
 * 66 PlusOne
 */
public class PlusOne {

    public static void main(String[] args) {

    }

    public static  int[] plusOne(int[] digits) {
        int length = digits.length;
        int lastNumber = digits[length-1];
        int sum = lastNumber + 1;
        if(sum != 10){
            digits[length-1] = sum;
        }else{

            for(int index=length-1;index>=0; index--){
                int eachNum = digits[index];
                
            }
        }
        return digits;
    }
}
