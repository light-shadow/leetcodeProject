package com.general.algorithm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1002. Find Common Characters
 */
public class FindCommonCharacters {

    public static void main(String[] args) {
        String[] arr = {"bella","label","roller"};
        System.out.println(commonChars(arr));

    }

    public static List<String> commonChars(String[] A) {
        List<Map<String, Integer>> list = new ArrayList<>(A.length);
        for(String each: A){
            Map<String, Integer> map = new HashMap<>();
            for(int i=0;i<each.length();i++){
                char eachChar = each.charAt(i);
                String eachStr = String.valueOf(eachChar);
                if(map.containsKey(eachStr)){
                    map.put(eachStr, map.get(eachStr)+1);
                }
                else{
                    map.put(eachStr, 1);
                }
            }
        }
        return null;
    }
}
