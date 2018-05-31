package com.general;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(16));
    }

    private static List<String> fizzBuzz(int n) {
        List<String>list  = new ArrayList<String>();
        for(int i=1;i<n+1;i++){
            if(i%3==0 && i%15!=0){
                list.add("Fizz");
            }else if(i%5==0 && i%15!=0){
                list.add("Buzz");
            }else if(i%15==0){
                list.add("FizzBuzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
