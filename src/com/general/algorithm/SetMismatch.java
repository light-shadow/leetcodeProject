package com.general.algorithm;


/**
 * 645. Set Mismatch
 * status:pass
 */
public class SetMismatch {
    public static void main(String[] args) {
        int[] arrs = {1,2,2,4};
        int[] result = findErrorNums(arrs);
        int[] arrs1 = {1,1};
        int[] result1 = findErrorNums(arrs1);
        printArrs(result1);
    }

    public static int[] findErrorNums(int[] nums) {
        int sum=0;
        int max = 0;
        int theOne = 0;
        for(int i=0;i<nums.length;i++){
            int each = nums[i];
            sum+=each;
            if(max < each) max = each;
            for(int j=i+1;j<nums.length;j++){
                int eachNum = nums[j];
                if((each^eachNum) == 0){
                    theOne = eachNum;
                }
            }
        }
        if(max!=nums.length){
            max = nums.length;
        }
        int ideaSum = (1+max)*nums.length/2;
        int cha = ideaSum - sum;
        int queshao = cha + theOne;
        int[] arr = new int[2];
        arr[0] = theOne;
        arr[1] = queshao;
        return arr;
    }

    private static void printArrs(int[] arrs){
        for(int each: arrs){
            System.out.println(each);
        }
    }
}

