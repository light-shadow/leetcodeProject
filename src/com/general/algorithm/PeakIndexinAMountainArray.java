package com.general.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 852. Peak Index in a Mountain Array
 */
public class PeakIndexinAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] A) {
        int max = 0;
        int target = 0;
        for(int each: A){
            if(each>max) max = each;
        }
        for(int i=0;i<A.length;i++){
            if(A[i] == max){
                target = i;
            }
        }
        return target;
    }
}
