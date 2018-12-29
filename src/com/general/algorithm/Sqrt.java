package com.general.algorithm;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }

    private static int mySqrt(int x) {
        // 牛顿法
        double g=x;
        while(Math.abs(g*g-x)>0.000001)
        {
            g=(g+x/g)/2;
        }
        return (int)g;
    }
}
