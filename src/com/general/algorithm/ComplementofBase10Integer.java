package com.general.algorithm;

/**
 * 1012. Complement of Base 10 Integer
 * status: pass
 */
public class ComplementofBase10Integer {

    public static void main(String[] args) {

    }

    public static int bitwiseComplement(int N) {
        String str = Integer.toBinaryString(N);
        Integer completeNumber = getBinaryString(str.length());
        return N^completeNumber;
    }

    public static Integer getBinaryString(int length){
        StringBuilder stringBuilder = new StringBuilder("");
        for(int i=0;i<length;i++){
            stringBuilder.append("1");
        }
        return Integer.valueOf(stringBuilder.toString(), 2);
    }
}
