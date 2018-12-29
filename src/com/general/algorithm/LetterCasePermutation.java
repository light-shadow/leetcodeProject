package com.general.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String s1 = "a1b2";
        System.out.println(letterCasePermutation(s1));
    }

    private static List<String> letterCasePermutation(String S) {
        // 循环遍历字符串
        // 依次把字母变为大写
        // 返回列表
        List<String> list = new ArrayList<String>();
        int length = S.length();
        list.add(S);
        for(int i=0;i<length;i++){
            StringBuilder sb = new StringBuilder(S);
            char eachChar = S.charAt(i);
            if(Character.isLowerCase(eachChar)){
                char each = Character.toUpperCase(eachChar);
                sb.deleteCharAt(i);
                sb.insert(i,each);
                list.add(sb.toString());
            }else if(Character.isUpperCase(eachChar)){
                char  each = Character.toLowerCase(eachChar);
                sb.deleteCharAt(i);
                sb.insert(i,each);
                list.add(sb.toString());
            }


        }
        return list;
    }
}
