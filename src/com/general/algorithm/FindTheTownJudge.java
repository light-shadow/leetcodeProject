package com.general.algorithm;

/**
 * 997. Find the Town Judge
 * status: pass
 * refrence: https://www.cnblogs.com/seyjs/p/10426072.html
 */
public class FindTheTownJudge {
    public static void main(String[] args) {

    }

    public static int findJudge(int N, int[][] trust) {
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
        for(int i=0;i<trust.length;i++){
            int[] each = trust[i];
            arr[each[0]-1] -=1;
            arr[each[1]-1] +=1;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k] == N-1){
                return k+1;
            }
        }
        return -1;
    }
}
