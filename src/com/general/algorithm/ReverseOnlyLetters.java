package com.general.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 917. Reverse Only Letters
 * status: pass
 */
public class ReverseOnlyLetters {

    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));

    }

    public static String reverseOnlyLetters(String S) {
        String[] arrs = new String[S.length()];
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<S.length();i++){
            char character = S.charAt(i);
            byte asciiCode = (byte)character;
            if((asciiCode>=65 && asciiCode <=90) || (asciiCode>=97 & asciiCode <=122)){
                arrs[i] = "";
                sb.append(S.substring(i, i+1));
            }
            else{
                arrs[i] = S.substring(i, i+1);
            }
        }
        String letter = sb.toString();
        Stack<String> stack = new Stack<>();
        for(int j=0;j<letter.length();j++){
            char c = letter.charAt(j);
            stack.push(String.valueOf(c));
        }
        for(int k=0;k<arrs.length;k++){
            if(arrs[k] == ""){
                String each = stack.pop();
                arrs[k] = each;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(String each: arrs){
            stringBuilder.append(each);
        }
        return stringBuilder.toString();
    }
}
