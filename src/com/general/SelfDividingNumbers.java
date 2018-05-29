package com.general;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left=1;
        int right=22;
        List<Integer> numList = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            if(isDividingNumber(i)){
                numList.add(i);
            }
        }
//        System.out.println(isDividingNumber(10));
        System.out.println(numList);
    }

    public static boolean isDividingNumber(int num){
        String numStr = String.valueOf(num);
        for(int i=0;i<numStr.length();i++){
            int each = Integer.valueOf(numStr.substring(i, i+1));
            if(each!=0 && num % each==0){
            }
            else{
                return false;
            }
        }
        return true;
    }
}
