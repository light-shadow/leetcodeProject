package com.general;

import java.util.*;

/**
 * 496. Next Greater Element I
 */
public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] num1 = {4,1,2}, num2 = {1,3,4,2};
        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
//        printArr(nextGreaterElement(num1,num2));
        printArr(nextGreaterElement(nums1,nums2));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length = nums1.length;
        int length2 = nums2.length;
        int[] newArr  =new int[nums1.length];
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<length2; i++){
            int each = nums2[i];
            list.add(each);
            map.put(each, i);
        }
        for(int j=0;j<length; j++){
            int each = nums1[j];
            int pointer = map.get(each);
            int value;
            if(pointer==list.size()-1){
                value = -1;
            }else{
                value = list.get(pointer+1);
            }
            if(value > each ){
                newArr[j] = value;
            }else{
                newArr[j] = -1;
            }
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
