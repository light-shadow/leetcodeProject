package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }
    private static int pivotIndex(int[] nums) {
        int length = nums.length;
        int[] newArr = new int[length+1];
        for(int i=0;i<length+1;i++){
            if(i==0){}
            else{
                newArr[i] = nums[length-i];
            }
        }
        for (int each: newArr) {
            System.out.println(each);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<length;i++){
            if(nums[i]==newArr[i]){
                list.add(i);
            }
        }
        System.out.println("----------------");
        return Collections.min(list);
    }
}
