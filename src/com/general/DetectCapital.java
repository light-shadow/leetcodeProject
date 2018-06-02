package com.general;


/*
*  探测以下情况，结果会返回true否则返回false
*  1、字符串的全部单词都为大写
*  2、字符串的全部单词都为小写
*  3、字符串的第一个字母为大写，其余字母为小写
* */
public class DetectCapital {
    public static void main(String[] args) {
//        System.out.println(detectCapitalUse("USA"));
//        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("Google"));
    }
    private static boolean detectCapitalUse(String word) {
        int length = word.length();
        // flag1判断首字母是否为大写的标志位
        // flag2判断首字母是否为小写的标志位
        // flag3判断第二个字母是否为小写的标志位
        // flag4判断第二个字母是否为大写的标志位
        boolean flag1=false;
        boolean flag2=false;
        boolean flag3=false;
        boolean flag4 = false;
        for(int i=0;i<length;i++){
            if(i==0 && Character.isUpperCase(word.charAt(0))){
                flag1 = true;
            }
            if(flag1==true){
                if(i==1 && Character.isLowerCase(word.charAt(1))){
                    flag3 = true;
                }else if(i==1 && Character.isUpperCase(word.charAt(1))){
                    flag4 = true;
                }
            }
            if(flag3==true){
                if(!Character.isLowerCase(word.charAt(i))){
                    return false;
                }else{
                    continue;
                }
            }
            if(flag4==true){
                if(!Character.isUpperCase(word.charAt(i))){
                    return false;
                }else{
                    continue;
                }
            }

            if(i==0 && Character.isLowerCase(word.charAt(0))){
                flag2 = true;
            }
            if(flag2 == true){
                if(!Character.isLowerCase(word.charAt(i))){
                    return false;
                }else{
                    continue;
                }
            }
        }
        return true;
    }
}
