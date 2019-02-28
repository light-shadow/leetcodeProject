package com.general.algorithm;

/**
 *  TODO
 * 26. Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2};
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray object = new RemoveDuplicatesFromSortedArray();
//        object.removeDuplicates(arr1);
        object.removeDuplicates(arr2);
//        System.out.println(object.removeDuplicates(arr2));

    }

    public  int removeDuplicates(int[] nums) {
        if(nums.length > 0){
            int lastIndex = 0;
            for(int i=1;i<nums.length; i++){
                if(nums[i] == nums[lastIndex]){
                    lastIndex = i;
                }else{
                    nums[lastIndex] = nums[i];
                }
            }
            for(int each: nums){
                System.out.println(each);
            }
            return 1;
        }else{
            return 0;
        }


    }
}
