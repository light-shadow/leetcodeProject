package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class MergeSortedArray {

    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<m; j++){
            list.add(nums1[j]);
        }
        for(int k=0;k<n;k++){
            list.add(nums2[k]);
        }
        Collections.sort(list);
        for(int i=0;i<m+n;i++){
            nums1[i] = list.get(i);
        }
    }
}
