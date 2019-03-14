package com.general.algorithm;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 172. Factorial Trailing Zeroes
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 */
public class FactorialTrailingZeroes {
    public static void main(String[] args) { 
        int num1 = 3;
        int num2 = 5;
//        System.out.println(trailingZeroes(5));
//        System.out.println(trailingZeroes(7));
        System.out.println(getFactor(7));
        System.out.println(getFactor(13));
    }

    public static int trailingZeroes(int n) {
        int factor = getFactor(n);
        String factorString = String.valueOf(factor);
        int count  = 0;
        for(int i=0;i<factorString.length()-1;i++){
            String each = factorString.substring(i, i+1);
            if("0".equals(each)){
                count++;
            }
        }
        return  count;
    }
    // 递归方式 容易栈溢出
    @Deprecated
    public static int factor(int n){
        if(n == 1){
            return 1;
        }
        else{
            return factor(n-1)*n;
        }
    }

    public static int getFactor(int n){
        int factor = 1;
        for(int i=1;i<=n; i++){
            factor*=i;
        }
        return factor;
    }


}
