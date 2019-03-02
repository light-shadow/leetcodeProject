package com.general.algorithm;

/**
 *
 */
public class CountPrimes {

    public static void main(String[] args) {

        System.out.println(countPrimes(10));

    }

    public static int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        if(n == 2){
            return 0;
        }
        int count = 1;
        for(int i=3; i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n){
        // 效率一般的素数判断算法 容易超时
//        if(n == 2){
//            return true;
//        }
//        boolean isPrime = true;
//        for(int i=2; i<n;i++){
//            if(n%i == 0){
//                isPrime = false;
//            }
//        }
//        return isPrime;
        // 效率更高的素数判断算法
        if(n < 2) return false;

        if(n == 2) return true;

        if(n%2==0) return false;

        for(int i = 3; i*i <= n; i += 2)

            if(n%i == 0) return false;

        return true;
    }
}
