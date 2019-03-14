package com.general.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 961. N-Repeated Element in Size 2N Array
 */
public class NRepeatedElementinSizeNArray {

    public static void main(String[] args) {

    }

    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>(10000);
        for(int each: A){
            if(!map.containsKey(each)){
                map.getOrDefault(each, 0);
            }
            else{
                map.put(each,  map.getOrDefault(each, 0));
            }
        }
        int target = 0;
        for(Map.Entry entry: map.entrySet()){
            if((Integer)entry.getValue()>=2){
               target = (Integer) entry.getKey();
            }
        }
        return target;
    }
}
