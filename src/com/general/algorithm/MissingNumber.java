package com.general.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 268. Missing Number
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 *
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] num1 = {3,0,1};
        int[] num2 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(num1));
        System.out.println(missingNumber(num2));


    }

    public static int missingNumber(int[] nums) {
        if(nums.length == 1){
            if(nums[0] == 0){
                return 1;
            }
        }
        int sum = 0;
        int max = 0;
        for(int i: nums){
            if(max<i) max = i;
            sum+= i;
        }
        int ideaSum = (nums.length+1)*(max)/2;
        return ideaSum - sum;

    }
}
