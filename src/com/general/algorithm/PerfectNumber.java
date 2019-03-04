package com.general.algorithm;

/**
 * 507. Perfect Number
 *
 * Example:
 * Input: 28
 * Output: True
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 */
public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if(num == 0 || num ==1){
            return false;
        }
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum += i;
            }
        }
        return sum == num;
    }
}
