package com.general;

import java.util.*;

public class DistributeCandies {

    public static void main(String[] args) {
        //定义随机组合最多位数
        int[] a=new int[]{1,1,2,3};
        System.out.println(distributeCandies(a));
    }

    private static int distributeCandies(int[] candies) {
        int length = candies.length;
        int[] b=new int[length];
        return combine2(candies, candies.length, length/2, b);
    }

    static int combine2(int[]a,int n,int m,int[] b){
        List numList = new ArrayList();
        for(int i=0;i<m;i++)
            b[i]=1;
        do{
            // 去重之后的列表长度加入到list中
            Set set = new HashSet(getArray(b,a));
            numList.add(set.size());
        }while(getFirstFlage(b,n,m)!=-1);
        return (int)Collections.max(numList);
    }

    static int getFirstFlage(int[]b,int n,int m){
        int count=0;
        for(int i=0;i<n-1;i++){

            if(b[i]==1&&b[i+1]==0){
                //交换位置
                b[i]=0;
                b[i+1]=1;
                //移动
                for(int j=0;j<count;j++){
                    b[j]=1;
                }
                for(int k=count;k<i;k++)
                    b[k]=0;
                // System.out.println(count+"=="+Arrays.toString(b));
                return i;
            }else if(b[i]==1){
                count++;
            }
        }
        return -1;
    }

    // 返回组合的情况 比如每次的组合[1,2]
    static List getArray(int[]b, int[]a){
        List list = new ArrayList();

        for(int i=0;i<b.length;i++){
            if(b[i]==1)
                list.add(a[i]);
        }
//        System.out.println(list);
//        System.out.println("---------------");
        return list;
    }
}
