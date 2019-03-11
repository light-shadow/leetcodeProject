package com.general.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 171. Excel Sheet Column Number
 * status: todo
 *
 * Input: "A"
 * Output: 1
 *
 * Input: "AB"
 * Output: 28
 *
 * Input: "ZY"
 * Output: 701
 */
public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    public static int titleToNumber(String s) {
        String reverse = new StringBuffer(s).reverse().toString();
        int length = s.length();
        int count = 0;
        for(int i=0;i<length;i++){
             int num = (int)reverse.charAt(i) - 64;
             count += num*Math.pow(26, i);
        }
        return count;
    }

}
