package com.general;

import java.util.Arrays;
import java.util.List;

/**
 * 496. Next Greater Element I
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
        for(int i=0;i<length;i++){
            int each = nums1[i];
            boolean flag = false;
            for(int j=i;j<length2;j++){
                if(nums2[j]>each){
                    newArr[i] = nums2[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) newArr[i] = -1;
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
