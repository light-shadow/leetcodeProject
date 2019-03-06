package com.general.algorithm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 812. Largest Triangle Area
 * status: todo
 */
public class LargestTriangleArea {

    public static void main(String[] args) {
//        int[][] points = new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}};
        int[][] points2 = new int[][]{{1,0},{0,0},{0,1}};

        System.out.println(largestTriangleArea(points2));
    }

    private static  double largestTriangleArea(int[][] points) {
        // 从所给的点中找出所有三个点的组合
        // 根据三个点的组合计算出三角形边长，分别为a，b，c
        // 根据三角形的边长，根据海伦公式计算出面积，将面积保存在ArrayList中
        // 比较所有的面积，找出最大的
        List<Double> list = new ArrayList<>();
        int length = points.length;
        for(int i=0;i<=length-3;i++){
            for(int j=i+1;j<=length-2;j++){
                for(int k=j+1;k<=length-1;k++){
                    int[] a = points[i];
                    int[] b = points[j];
                    int[] c = points[k];
                    if(isTriagnle(a, b, c)){
                        list.add(calaulateSurface(a, b, c));
                    }
                }
            }
        }
        return Collections.max(list);
    }

    // 判断三个点能否组成三角形
    private static boolean isTriagnle(int[] a,int[] b, int[] c){
        double length1 = calculateLength(a, b);
        double length2 = calculateLength(a, c);
        double length3 = calculateLength(b, c);
        return (length1+length2)>length3
                &&(length1+length3)>length2
                &&(length2+length3)>length1;
    }


    // 计算三角形的面积
    private static double calaulateSurface(int[] a, int[] b, int[] c){
        double x = getFloat(calculateLength(a, b), "0.000000");
        double y = getFloat(calculateLength(a, c), "0.000000");
        double z = getFloat(calculateLength(b, c), "0.000000");
        double p = (x+y+z)/2;
        double squareX = getFloat(x*x, "0.00000000");
        double squareY = getFloat(y*y, "0.00000000");
        double squareZ = getFloat(z*z, "0.00000000");
        if(Math.abs(squareX + squareY- squareZ)<=Math.pow(10, -5)){
            return getFloat(x*y/2, "0.000000");
        }
        else if(Math.abs(squareX + squareZ - squareY)<=Math.pow(10, -5)){
            return getFloat(x*z/2, "0.000000");
        }
        else if(Math.abs(squareY + squareZ - squareX)<=Math.pow(10, -5)){
            return getFloat(y*x/2, "0.000000");
        }
        DecimalFormat df = new DecimalFormat("0.0");
        double square = Math.sqrt(
                p*(p-x)*(p-y)*(p-z)
        );
        System.out.println("a="+x+",b="+y+",c="+z+",三角形面积为"+Math.sqrt(
                p*(p-x)*(p-y)*(p-z)
        ));
        return  Double.valueOf(df.format(square));
    }



    // 根据两个点计算边长的距离
    private static double calculateLength(int[]x, int[] y){
        return Math.sqrt(
          Math.pow(x[0]-y[0], 2) + Math.pow(x[1]-y[1], 2)
        );
    }

    /**
     * 获取double的近似值
     * @param s
     * @param point
     * @return
     */
    public static double getFloat(double s, String point){
        DecimalFormat df1 = new DecimalFormat(point);
        return Double.valueOf(df1.format(s));
    }


}
