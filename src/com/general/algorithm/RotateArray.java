package com.general.algorithm;

/**
 * 189. Rotate Array
 * status:todo
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arrs1 = { 1,2,3,4,5,6,7};

        rotate(arrs1, 3);
    }

    public static void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int last = nums[nums.length - 1];
            int first = nums[0];
            for(int j= nums.length-1;j>=1;j--){
                if(j-1 ==0){

                }
                nums[j] = nums[j-1];


            }
        }
        for(int each: nums){
            System.out.println(each);
        }
    }

    private static void printArr(int[] arrs){
        for(int each: arrs){
            System.out.println(each);
        }
    }
}
