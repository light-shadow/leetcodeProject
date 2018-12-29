package com.general.algorithm;

import java.util.*;

/**
 *  No.804
 * 不同的莫尔斯编码
 *
 */
public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    private static  int uniqueMorseRepresentations(String[] words) {
        // 获取每个列表中单词的莫尔斯电码
        // 将莫尔斯电码使用set集合进行去重处理
        // 返回去重之后的集合的长度
        String[] letterMap = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<String> morseList = new ArrayList<String>();
        int length = words.length;
        for(int i=0;i<length;i++){
            String each = words[i];
            int eachLength = each.length();
            StringBuilder sb = new StringBuilder("");
            for(int j=0;j<eachLength;j++){
                String eachWord = each.substring(j,j+1);
                char[] eachChar = eachWord.toCharArray();
                sb.append(letterMap[eachChar[0]-97]);
            }
            morseList.add(sb.toString());
        }
        Set<String> set = new HashSet<String>(morseList);
        System.out.println(set);
        return set.size();
    }
}
