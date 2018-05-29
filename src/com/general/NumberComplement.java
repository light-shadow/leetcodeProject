package com.general;

public class NumberComplement {
    public static void main(String[] args) {
        findComplement(1);
    }
    private static int findComplement(int num) {
        // 首先获取数的二进制
        // 获取二进制的补码
        // 将二级制的补码转换为10进制，返回十进制
        String binary = fromInt2Binary(num);
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<binary.length();i++){
            int each = Integer.valueOf(binary.substring(i,i+1));
            each ^= 1;
            sb.append(String.valueOf(each));
        }
        System.out.println(Integer.valueOf(fromBinary2Int(sb.toString())));
        return 0;
    }

    private static String fromInt2Binary(int num){
        return Integer.toBinaryString(num);
    }

    private static String fromBinary2Int(String bina){
        return Integer.valueOf(bina,2).toString();
    }
}
