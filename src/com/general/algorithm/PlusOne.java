package com.general.algorithm;

/**
 * 66 PlusOne
 */
public class PlusOne {

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,3,2,1};
        int[] nums3 = {9,9,9,9};
        int[] nums4 = {2,4,9,3,9};
        plusOne.printArr(plusOne.plusOne(nums1));
        plusOne.printArr(plusOne.plusOne(nums2));
        plusOne.printArr(plusOne.plusOne(nums3));
        plusOne.printArr(plusOne.plusOne(nums4));
    }

    public   int[] plusOne(int[] digits) {
        // 从后向前遍历
        // 如果末尾加1后 大于等于10  则向前面进位 将此位置置为和与10的余数  向前进位为此和与10的商
        // 以此遍历 若数组第一个数等于9的话 将此位置0  将数组拷贝 最前面赋值为1
        int length = digits.length;
        int lastNumber = digits[length-1];
        int sum = lastNumber + 1;
        if(sum != 10){
            digits[length-1] = sum;
        }else{
            int yu;
            int plus = 1;
            for(int size=digits.length-1;size>=0; size--){
                int _sum = digits[size]+plus;
                yu = _sum%10;
                if(_sum != 10) {
                    digits[size] = _sum;
                    plus = 0;
                }
                else{
                    if(size == 0 && digits[0] == 9){
                        digits[0] = yu;
                        int[] newDigit = new int[length+1];
                        System.arraycopy(digits, 0, newDigit, 1, length);
                        newDigit[0] = 1;
                        return newDigit;
                    }else{
                        plus = _sum/10;
                        yu = _sum%10;
                        digits[size] = yu;
                    }
                }
            }
        }
        return digits;
    }

    public void printArr(int[] digit){
        for(int i=0;i<digit.length;i++){
            System.out.print(digit[i]);
            System.out.print(",");
        }
        System.out.println();
    }
}
