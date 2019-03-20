package com.general.algorithm;

/**
 * 896. Monotonic Array
 * status: pass
 */
public class MonotonicArray {

    public static void main(String[] args) {

        int[] A = {1,2,2,3};
        System.out.println(isMonotonic(A));
    }

    public static boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);

    }

    public static boolean increasing(int[] A){
        boolean flag = true;
        for(int i=0;i<A.length-1;i++){
            if(A[i]<=A[i+1]){

            }
            else{
                return false;
            }
        }
        return flag;
    }

    public static boolean decreasing(int[] A){
        boolean flag = true;
        for(int i=0;i<A.length-1;i++){
            if(A[i]>=A[i+1]){

            }
            else{
                return false;
            }
        }
        return flag;
    }
}
