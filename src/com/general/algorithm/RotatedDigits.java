package com.general.algorithm;

/**
 * 788. Rotated Digits
 * status: pass
 */
public class RotatedDigits {

    public static void main(String[] args) {

    }

    public static int rotatedDigits(int N) {
        int count = 0;
        for(int i=1;i<=N;i++){
            if(isGood(i)) count++;
        }
        return count;

    }

    public static boolean isGood(int n){
        String string = String.valueOf(n);
        String after = string;
        boolean flag = string.contains("2") || string.contains("5") || string.contains("6") || string.contains("9");
        boolean flag2 = !( string.contains("3") || string.contains("4") || string.contains("7"));
        if(flag && flag2){
            return true;
        }
        return false;
    }
}
