package com.general.algorithm;

/**
 * 219. Contains Duplicate II
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] arrs = {1,2,3,1};
        int k=3;
        int[] arrs1 = {1,0,1,1};
        int k1 = 1;
        int[] arrs2 ={1,2,3,1,2,3};
        int  k2 = 2;
        System.out.println(containsNearbyDuplicate(arrs2, k2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k>=nums.length){
            return false;
        }
        for(int i=0;i<nums.length; i++){
            if(i<k){
                if(i+k< nums.length){
                    if(nums[i] == nums[i+k]){
                        return true;
                    }
                }
            }
            else{
                if(i-k<nums.length){
                    if(nums[i] == nums[i-k]){
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
