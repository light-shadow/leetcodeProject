package com.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * No.821
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 * Status: pass
 */
public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        String a = "loveleetcode";
//        System.out.println(a.indexOf("e"));
        printArr(shortestToChar(a, 'e'));
    }

    private static int[] shortestToChar(String S, char C) {
        // 将所有的等于c元素的索引放置到list中
        // 遍历原有字符串 依次取出每个元素的索引位置并和list中的每一个元素
        // 取差 绝对值  选择最小的元素
        int length = S.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == C) {
                list.add(i);
            }
        }
        System.out.println(list);
        int[] arr = new int[length];
        int listLength = list.size();
        for (int i = 0; i < length; i++) {
            List<Integer> chaji = new ArrayList<>();
            for (int j = 0; j < listLength; j++) {
                Integer origin = i;
                Integer index = list.get(j);
                int each = Math.abs(origin - index);
                chaji.add(each);
            }
            arr[i] = Collections.min(chaji);
        }
        return arr;
    }

    private static void printArr(int[] arr) {
        for (Integer each : arr) {
            System.out.println(each);
        }
    }
}
