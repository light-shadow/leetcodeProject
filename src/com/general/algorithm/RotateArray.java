package com.general.algorithm;

/**
 * 189. Rotate Array
 * status:todo
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arrs1 = { 1,2,3,4,5,6,7};

        rotate(arrs1, 3);
        printArr(arrs1);
    }

    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    private static void printArr(int[] arrs){
        for(int each: arrs){
            System.out.println(each);
        }
    }
}
