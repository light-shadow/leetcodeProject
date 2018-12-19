package com.general;

public class PrimeNumberOfSetBits {
    public static void main(String[] args) {
//        System.out.println(isPrime(5));
        int L = 6, R = 10;
//        System.out.println(countPrimeSetBits(L,R));
        int L1 = 10, R1 = 15;
        System.out.println(countPrimeSetBits(L1, R1));
    }
    private static int countPrimeSetBits(int L, int R) {
        // 循环遍历这个边界
        // 将边界内的数转换为2进制
        // 找出二进制中1的个数
        // 判断1的个数是否为素数 计算1的个数为素数的和
        int count= 0;
        for(int i=L;i<=R;i++){
            String each = Integer.toBinaryString(i);
            int setNum = 0;
            for(int j=0;j<each.length();j++){
                String eachL = each.substring(j,j+1);
                if(eachL.equalsIgnoreCase("1")){
                    setNum++;
                }
            }
            if(isPrime(setNum)) count++;
        }
        return count;
    }

    // 判断一个数字是否为素数
    private static boolean isPrime(int num){
        if(num==1) return false;
        if(num==2) return true;
        boolean isPrime = true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(!isPrime)
            return false;
        return true;
    }
}
