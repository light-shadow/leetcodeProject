package com.general.algorithm;

import java.util.*;

/**
 * 414. Third Maximum Number
 * status: pass
 */
public class ThirdMaximumNumber {
    public static void main(String[] args) {

    }

    public static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int each: nums){
            set.add(each);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()>=3){
            return list.get(list.size()-3);
        }
        else{
            return list.get(list.size()-1);
        }
    }
}
