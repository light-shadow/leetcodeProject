package com.general.algorithm;

import java.util.*;

/**
 * 496. Next Greater Element I
 * status: pass
 */
public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] num1 = {4,1,2}, num2 = {1,3,4,2};
        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
        printArr(nextGreaterElement(num1,num2));
//        printArr(nextGreaterElement(nums1,nums2));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length = nums1.length;
        int length2 = nums2.length;
        int[] newArr  =new int[nums1.length];
        List<Integer> list1 =new ArrayList<>(length);
        List<Integer> list2 =new ArrayList<>(length2);
        for(int each: nums1){
            list1.add(each);
        }
        for(int each: nums2){
            list2.add(each);
        }
        for(int i=0;i<length;i++){
            int each = list1.get(i);
            int index = list2.indexOf(each);
            boolean isFirst = false;
            int target = -1;
            for(int j=index;j<length2;j++){
                int each2 = list2.get(j);
                if(each2 > each && !isFirst){
                    isFirst = true;
                    target = each2;
                }
            }
            newArr[i] = target;
        }
        return newArr;
    }

    private static void printArr(int [] arr){
        for (int each: arr) {
            System.out.println(each);
        }
        System.out.println("------------------------------");
    }
}
