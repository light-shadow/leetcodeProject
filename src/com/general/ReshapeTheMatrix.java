package com.general;

import java.util.ArrayList;
import java.util.List;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] list = {{1,2}, {3,4}, {5,6}};
        int r=2,c=3;
        print(matrixReshape(list, r,c));

        int[][]list1 = {{1,2},{3,4}};
        int r1=1,c1=4;
        print(matrixReshape(list1,r1,c1));

    }

    private static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        List<Integer> list = new ArrayList<Integer>();
        if(row *col!=r*c){
            return nums;
        } else{
            // 先将列表展平为一个一维列表
            list.add(0);
            for(int i=0;i<row;i++){
                int colum = nums[i].length;
                for(int j=0;j<colum;j++){
                    list.add(nums[i][j]);
                }
            }
            int[][] newArr = new int[r][c];
            for(int i=1;i<list.size();i++){
                int x = i/c;
                int y = i%c;
                // y为0 说明是最后一位
                if(i%c==0) newArr[x-1][c-1] = list.get(i);
                else newArr[x][y-1] = list.get(i);
//                System.out.println(list.get(i));
            }
            return newArr;
        }
    }

    private static void print(int [][] list){
        int firstLeng = list.length;
        for(int i=0;i<firstLeng;i++){
            for(int j=0;j<list[i].length;j++){
                System.out.println(list[i][j]);
            }
            System.out.println("-------------------");
        }
        System.out.println("----------------------------------");
    }
}
