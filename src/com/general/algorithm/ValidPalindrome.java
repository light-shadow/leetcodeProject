package com.general.algorithm;

import javax.swing.*;

/**
 * 125. Valid Palindrome
 * status:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str1));
    }

    public static boolean isPalindrome(String str) {
        // 去除符号 括号 只保留字母和数字
        str = str.replaceAll("[^a-z^A-Z^0-9]", "").toLowerCase();
        int length = str.length();
        if(length == 0){
            return true;
        }
        else{
            int count = 0;
            for(int i=0;i<length;i++){
                Character character = str.charAt(i);
                Character character1Mirror = str.charAt(length-1-i);
                if(character.equals(character1Mirror)){
                    count++;
                }
            }
            if(count == str.length()) {
                return true;
            }
            else{
                return false;
            }
        }

    }
}
