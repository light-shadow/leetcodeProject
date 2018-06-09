package com.general;

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
        int[] num2 = {2, 3,1};
        printArr(intersection(num2,num1));
    }
    private static int[] intersection(int[] nums1, int[] nums2) {
        // 将数组转换为set
        // set取交集
        // 返回为一个数组
        int length1 = nums1.length;
        int length2 = nums2.length;
        Set<Integer> set = new HashSet<>();
        // 第一个数组的长度大于第二个数组
        if(length1>length2){
            for(int i=0;i<length2;i++){
                for(int j=0;j<length1;j++){
                    if(nums1[j]==nums2[i])
                        set.add(nums2[i]);
                }
            }
        }else{
            for(int i=0;i<length1;i++){
                for(int j=0;j<length2;j++){
                    if(nums1[i]==nums2[j])
                        set.add(nums1[i]);
                }
            }
        }
//        System.out.println(set);
        int length3 = set.size();
        int[] newArr = new int[length3];
        Iterator<Integer> iterator = set.iterator();
        int count = 0;
        while(iterator.hasNext()){
            newArr[count] = iterator.next().intValue();
            count++;
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
