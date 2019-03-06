package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 949. Largest Time for Given Digits
 * status:
 */
public class LargestTimeforGivenDigits {

    public static void main(String[] args) {
        int[] arrs = {1, 2, 3, 4};
        int[] arrs1 = {0, 0, 0, 0};
        System.out.println(largestTimeFromDigits(arrs1));
    }

    public static String largestTimeFromDigits(int[] A) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        int one = A[0];
        int two = A[1];
        int three = A[2];
        int four = A[3];
        // 1234
        sb.append(one).append(two).append(three).append(four);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 1243
        sb.append(one).append(two).append(four).append(three);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 1324
        sb.append(one).append(three).append(two).append(four);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 1342
        sb.append(one).append(three).append(four).append(two);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 1423
        sb.append(one).append(four).append(two).append(three);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 1432
        sb.append(one).append(four).append(three).append(two);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");

        // 2134
        sb.append(two).append(one).append(three).append(four);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 2143
        sb.append(two).append(one).append(four).append(three);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 2314
        sb.append(two).append(three).append(one).append(four);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 2341
        sb.append(two).append(three).append(four).append(one);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 2413
        sb.append(two).append(four).append(one).append(three);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 2431
        sb.append(two).append(four).append(three).append(one);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");

        // 3124
        sb.append(three).append(one).append(two).append(four);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 3142
        sb.append(three).append(one).append(four).append(two);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 3214
        sb.append(three).append(two).append(one).append(four);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 3241
        sb.append(three).append(two).append(four).append(one);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 3412
        sb.append(three).append(four).append(one).append(two);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 3421
        sb.append(three).append(four).append(two).append(one);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");

        // 4123
        sb.append(four).append(one).append(two).append(three);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 4132
        sb.append(four).append(one).append(three).append(two);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 4213
        sb.append(four).append(two).append(one).append(three);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 4231
        sb.append(four).append(two).append(three).append(one);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 4312
        sb.append(four).append(three).append(one).append(two);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        // 4321
        sb.append(four).append(three).append(two).append(one);
        list.add(Integer.valueOf(sb.toString()));
        sb = new StringBuilder("");
        return getString(list);
    }

    public static String getString(List<Integer> list){
        if(list.size() == 0){
            return "";
        }
        else{
            int max = Collections.max(list);
            if(max <= 2359){
                if(max == 0){
                    return "00:00";
                }
                return String.valueOf(max).substring(0,2)+":"+String.valueOf(max).substring(2,4);
            }
            else{
                list.remove((Object)max);
                return getString(list);
            }
        }
    }
}
