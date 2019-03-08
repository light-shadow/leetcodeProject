package com.general.algorithm;

import java.util.*;

/**
 * No.349
 * 给定两个数组，写一个函数来计算它们的交集。
 * status: pass
 *
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 3, 1};
        printArr(intersection(num2,num1));
    }
    private static int[] intersection(int[] nums1, int[] nums2) {
        // 将数组转换为set
        // set取交集
        // 返回为一个数组
        // 第一个数组的长度大于第二个数组
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int each: nums1){
            set.add(each);
        }
        for(int each: nums2){
            if(set.contains(each)){
                set1.add(each);
            }
        }
        int[] newArr = new int[set1.size()];
        int count = 0;
        for(int each: set1){
            newArr[count++] = each;
        }
        return newArr;
    }
    private static void printArr(int[] arr){
        for (int each:
             arr) {
            System.out.println(each);

        }
    }
}
