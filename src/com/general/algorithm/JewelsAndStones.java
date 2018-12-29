package com.general.algorithm;

public class JewelsAndStones {
    public static void main(String[] args) {
        int sum = 0;
        String J = "aA";
        String Q = "aAAbbbb";
        for(int i=0;i<J.length();i++){
            sum += count(J.substring(i,i+1), Q);
        }
        System.out.println(sum);

    }

    private static int count(String ch, String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(ch.equals(str.substring(i,i+1))){
                count++;
            }
        }
        return count;
    }
}
