package com.general.algorithm;

/**
 * 724. Find Pivot Index
 * status: pass
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }
    private static int pivotIndex(int[] nums) {
        int length = nums.length;
        if(length < 3){
            return -1;
        }
        for(int i=0;i<length;i++){
            int left;
            if(i==0){
                left = 0;
            }
            else{
                left  = getSum(0, i-1, nums);
            }
            int right  = getSum(i+1, length-1, nums);
            if((left == right)){
                System.out.println(nums[i]);
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据参数计算数组的元素之和
     * 包含开始，包含结束
     * @param start
     * @param end
     * @param nums
     * @return
     */
    public static int getSum(int start, int end, int[] nums){
        int count = 0;
        for(int i=start;i<=end;i++){
            count+=nums[i];
        }
        return count;
    }
}
