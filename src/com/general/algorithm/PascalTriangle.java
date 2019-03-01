package com.general.algorithm;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 118. Pascal's Triangle
 */
public class PascalTriangle {

    public static void main(String[] args) {
//        System.out.println(generateRe(1));
//        System.out.println(generateRe(2));
//        System.out.println(generateRe(3));
//        System.out.println(generateRe(4));
        System.out.println(generateRe(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rst = new ArrayList<>();
        if(numRows == 0){
            return rst;
        }


        List<Integer> first = new ArrayList<>();
        first.add(0, 1);
        rst.add(first);

        for(int i=1;i<numRows-1;i++){
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < i + 1; j++){
                tmp.add(-1);
            }
            List<Integer> prev = rst.get(i-1);
            tmp.set(0, prev.get(0));
            tmp.set(i, prev.get(i-1));
            for(int j=0;j<i; j++){
                tmp.set(j, prev.get(j-1)+ prev.get(j+1));
            }
            rst.add(tmp);
        }
        return rst;
    }


    public static List<List<Integer>> generateRe(int numRows){
        List<List<Integer>> rst = new ArrayList<>();
        if (numRows == 0) {
            return rst;
        }

        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(0, 1);
        rst.add(first);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>(i + 1);
            for (int j = 0; j < i + 1; j++){
                tmp.add(-1);
            }
            List<Integer> prev = rst.get(i - 1);
            tmp.set(0, prev.get(0));
            tmp.set(i, prev.get(i - 1));
            for (int j = 1; j < i; j++){
                tmp.set(j, prev.get(j - 1)+prev.get(j));
            }
            rst.add(tmp);
        }
        return rst;
    }
}
