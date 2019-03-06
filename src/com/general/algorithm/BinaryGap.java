package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

/**
 * 868. Binary Gap
 */
public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(binaryGap(8));
    }

    public static int binaryGap(int N) {
        String string = Integer.toBinaryString(N);
        List<Integer> list = new ArrayList<>();
        List<Integer> chaList = new ArrayList<>();
        for(int i=0;i<string.length();i++){
            String each = string.substring(i, i+1);
            if("1".equals(each)){
                list.add(i);
            }
        }
        for(int j=0;j<list.size()-1;j++){
            Integer next = list.get(j+1);
            Integer now = list.get(j);
            chaList.add(next - now);
        }
        if(chaList.size() == 0){
            return 0;
        }
        return Collections.max(chaList);
    }
}
