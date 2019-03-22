package com.general.algorithm;

/**
 * 942. DI String Match
 * status: pass
 * reference: https://blog.csdn.net/fuxuemingzhu/article/details/84206493
 */
public class DIStringMatch {

    public static void main(String[] args) {

    }

    public static int[] diStringMatch(String S) {
        int[] arr = new int[S.length()+1];
        int ni = 0;
        int nd = S.length();
        for(int i=0;i<S.length();i++){
            String each = S.substring(i, i+1);
            if("D".equals(each)){
                arr[i] = nd;
                nd--;
            }
            else{
                arr[i] = ni;
                ni++;
            }
        }
        arr[S.length()] = nd;
        return arr;
    }
}
