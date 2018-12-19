package com.general;

/**
 * 实现函数 ToLowerCase()，
 * 该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串
 */
public class ToLowerCase {

    public static String toLowerCase(String str) {
        // 循环每一个字符
        // 若为大写字符 转换为小写
        // 每次循环添加到StringBuilder
        // 返回输出的字符串
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length(); i++){
            Character each = str.charAt(i);
            if(Character.isUpperCase(each)){
                Character ch = Character.toLowerCase(each);
                sb.append(ch);
            }else{
                sb.append(each);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "HellO";
        print(toLowerCase(str1));
        print(toLowerCase(str2));
    }


    public static void print(String str){
        System.out.println(str);
    }
}
