package com.general.algorithm;

import java.util.*;

/**
 * 350. Intersection of Two Arrays II
 * status: pass
 */
public class IntersectionofTwoArraysII {

    public static void main(String[] args) {
        int[] arrs1 = {1,2,2,1};
        int[] arrs2 =  {2,2};
        printArrs(intersect(arrs1, arrs2));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        for (int num : nums1) {
            nums1Map.put(num, nums1Map.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (nums1Map.containsKey(num) && nums1Map.get(num) != 0) {
                result.add(num);
                nums1Map.put(num, nums1Map.get(num) - 1);
            }
        }
        int[] resultArray = new int[result.size()];
        int index = 0;
        for (int item : result) {
            resultArray[index++] = item;
        }
        return resultArray;

    }

    public static void printArrs(int[] arrs){
        for(int each: arrs){
            System.out.println(each);
        }
    }
}
