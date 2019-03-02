package com.general.algorithm;

import java.util.Map;

/**
 * 367. Valid Perfect Square
 * status: pass
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 *
 * Example 2:
 *
 * Input: 14
 * Output: false
 */
public class ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
    }

    public static boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        for(int i=1;i<num;i++){
            if(i*i - num ==0){
                return true;
            }
        }
        return false;
    }
}
