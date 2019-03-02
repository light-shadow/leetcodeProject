package com.general.algorithm;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println(getFactor(13));
    }

    public static int trailingZeroes(int n) {
        int factor = getFactor(n);
        String factorString = String.valueOf(factor);
        int length = factorString.length();
        int count  = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=length; i>=1;i--){
            String each = factorString.substring(i-1, i);
            if(each.equals("0")){
                list.add(0);
            }
            else{
                list.add(1);
            }
        }
        int or = 1;
        boolean flag = true;
        for(Integer each: list){
            or ^= each;
            if(or == 1){
                count++;
            }
            else{
                flag = false;
            }
            if(!flag){
                break;
            }
        }
        return count;
    }
    // 递归方式 容易栈溢出
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
