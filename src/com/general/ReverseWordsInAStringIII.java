package com.general;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        int length = s.length();
        String[] strList = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<strList.length; i++){
            String eachStr = strList[i];
            int eachStrLength = eachStr.length();
            for(int j=eachStrLength-1;j>=0; j--){
                String each= eachStr.substring(j, j+1);
                sb.append(each);
            }
            sb.append(" ");
        }
        return sb.toString().substring(0,length);

    }
}
