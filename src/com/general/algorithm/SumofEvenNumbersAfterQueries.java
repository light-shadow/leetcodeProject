package com.general.algorithm;

/**
 * 985. Sum of Even Numbers After Queries
 * status:
 */
public class SumofEvenNumbersAfterQueries {

    public static void main(String[] args) {
        int[] arrs = {-4};
        int[] A = {1,2,3,4};
        int[][] queries = new int[4][2];
        queries[0] = new int[]{1, 0};
        queries[1] = new int[]{-3, 1};
        queries[2] = new int[]{-4, 0};
        queries[3] = new int[]{2, 3};

        printArr(sumEvenAfterQueries(A, queries));

    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] newArras = new int[A.length];
        int length1 = queries.length;
        for(int i=0;i<length1;i++){
            int[] each = queries[i];
            int val = each[0];
            int index = each[1];
            A[index]+=val;
            newArras[i] = sumOfEven(A);
        }
        return newArras;
    }

    public static int sumOfEven(int[] arrs){
        int sum = 0;
        for(int each: arrs){
            if(Math.abs(each)%2==0){
                sum+=each;
            }
        }
        return sum;
    }

    public static void printArr(int[] arrs){
        for(int each: arrs){
            System.out.println(each);
        }
        System.out.println("--------------------------");
    }
}
