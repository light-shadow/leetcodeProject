package com.general.algorithm;

public class LargestTriangleArea {

    public static void main(String[] args) {
        int[][] points = new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}};

        assert largestTriangleArea(points) == 2;
    }

    private static  double largestTriangleArea(int[][] points) {
        // 从所给的点中找出所有三个点的组合
        // 根据三个点的组合计算出三角形边长，分别为a，b，c
        // 根据三角形的边长，根据海伦公式计算出面积，将面积保存在ArrayList中
        // 比较所有的面积，找出最大的
        int length = points.length;

        return 0;
    }


    // 计算三角形的面积
    private static double calArea(int[] a,int[] b, int[] c){
        double x = calBianChang(a, b);
        double y = calBianChang(a, c);
        double z = calBianChang(b, c);
        double p = (x+y+z)/2;
        return Math.sqrt(
            p*(p-x)*(p-y)*(p-z)
        );
    }

    // 根据两个点计算边长的距离
    private static double calBianChang(int[]x, int[] y){
        return Math.sqrt(
          Math.pow(x[0]-y[0], 2) + Math.pow(x[1]-y[1], 2)
        );
    }


}
