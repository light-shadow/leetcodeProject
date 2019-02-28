package com.general.algorithm;


import java.util.ArrayList;
import java.util.List;

/**
 * 14. Longest Common Prefix
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str1 = {"flower","flow","flight"};
        String[] str2 = {"dog","racecar","car"};
        String[] str3 = {"ca","a"};
        String[] str4 = {"aca","cba"};

        System.out.println(longestCommonPrefix(str1));
        System.out.println(longestCommonPrefix(str2));
        System.out.println(longestCommonPrefix(str3));
        System.out.println(longestCommonPrefix(str4));


    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length>0){
            String shortest = strs[0];
            int shortestLength = shortest.length();
            // 找出最短的字符串
            int shortIndex = 0;
            List<String> list = new ArrayList<>();
            for(int j=0;j<strs.length;j++){
                String eachString = strs[j];
                int length = eachString.length();
                if(shortestLength >= length){
                    shortest = eachString;
                    shortestLength = eachString.length();
                    shortIndex = j;
                }
                list.add(eachString);
            }
            list.remove(shortIndex);
            // 开始遍历
            StringBuilder sb = new StringBuilder("");
            boolean isHas = true;
            for(int i=0;i<shortestLength;i++){
                int count = 0;
                String eachStr = shortest.substring(i, i+1);
                for(String str: list){
                    if(getIndexCharacter(str, i).equals(eachStr)){
                        count++;
                    }
                    else{
                        isHas = false;
                    }
                }
                if(count == list.size() && isHas){
                    sb.append(eachStr);
                }
            }
            return sb.toString();
        }
        else{
            return "";
        }
    }

    public static String getIndexCharacter(String string, int index){
        if(index>=string.length()){
            return "";
        }
        else{
            return string.substring(index, index+1);
        }

    }
}
