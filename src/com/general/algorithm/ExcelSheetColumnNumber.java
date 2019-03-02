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
        System.out.println(26*26+25);
    }

    public int titleToNumber(String s) {
        Map<String, Object> map = getMap();

        return 0;
    }

    public static Map<String, Object> getMap(){
        Map<String, Object> map = new HashMap<>();
        String[] alphabet = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R,",
                "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        int[] nums = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24, 25, 26
        };
        for(int i=0;i<alphabet.length; i++){
            map.put(alphabet[i], nums[i]);
        }
        return map;
    }
}
