package com.general.algorithm;

import java.util.*;

/**
 * 884. Uncommon Words from Two Sentences
 */
public class UncommonWordsfromTwoSentences {

    public static void main(String[] args) {
        String A = "this apple is sweet", B = "this apple is sour";
        String A1 = "apple apple", B1 = "banana";
        printArr(uncommonFromSentences(A, B));
        printArr(uncommonFromSentences(A1, B1));

    }

    public static String[] uncommonFromSentences(String A, String B) {
        String[] str1 = A.split(" ");
        String[] str2 = B.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String each: str1){
            if(map.containsKey(each)){
                map.put(each, map.getOrDefault(each, 0)+1);
            }
            else{
                map.put(each, 1);
            }
        }
        for(String each: str2){
            if(map.containsKey(each)){
                map.put(each, map.getOrDefault(each, 0)+1);
            }
            else{
                map.put(each, 1);
            }
        }
        int count = 0;
        for(Map.Entry entry: map.entrySet()){
            if((int)entry.getValue()<2){
                count++;
            }
        }
        int index = 0;
        String[] newArrs = new String[count];
        for(Map.Entry entry: map.entrySet()){
            if((int)entry.getValue()<2){
                newArrs[index] = (String)entry.getKey();
                index++;
            }
        }
        return newArrs;


    }

    public static void printArr(String[] arrs){
        for(String each: arrs){
            System.out.println(each);
        }
        System.out.println("---------------------------------");
    }
}
