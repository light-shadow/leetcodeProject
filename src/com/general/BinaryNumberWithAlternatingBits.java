package com.general;

/**
 *  No.693
 *  给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 *
 */
public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        int n= 5;
        System.out.println(hasAlternatingBits(n));
        int n1 = 7;
        System.out.println(hasAlternatingBits(n1));
        int n2 = 10;
        System.out.println(hasAlternatingBits(n2));
        int n3 = 11;
        System.out.println(hasAlternatingBits(n3));

    }

    private static  boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        int length = binary.length();
        for(int i=1;i<length;i++){
            int each;
            int before = Integer.valueOf(binary.substring(i-1,i));
            int after = Integer.valueOf(binary.substring(i,i+1));
            each = before ^ after;
            if(each==0){
                return false;
            }
        }
        return true;
    }
}
