package com.general.algorithm;

import java.util.Stack;

/**
 * 844. Backspace String Compare
 */
public class BackspaceStringCompare {
    public static void main(String[] args) {
        String S = "ab#c", T = "ad#c";
        String S1 = "ab##", T1 = "c#d#";
        String S2 = "a##c", T2 = "#a#c";
        String  S3 = "a#c", T3 = "b";
        String S4 = "ab##", T4= "c#d#";

        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
//        System.out.println(backspaceStringCompare.backspaceCompare(S, T));
//        System.out.println(backspaceStringCompare.backspaceCompare(S1, T1));
//        System.out.println(backspaceStringCompare.backspaceCompare(S2, T2));
//        System.out.println(backspaceStringCompare.backspaceCompare(S3, T3));
        System.out.println(backspaceStringCompare.backspaceCompare(S4, T4));
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<String> stack1 = getStack(S);
        Stack<String> stack2 = getStack(T);
        return stack1.equals(stack2);
    }

    private  Stack<String> getStack(String str){
        Stack<String> stack = new Stack<String>();
        if(str.equals("") || str.equals(" ")){
            return stack;
        }
        else{
            for(int i=0;i<str.length(); i++){
                String each = str.substring(i, i+1);
                if(!each.equals("#")){
                    stack.push(each);
                }else{
                    if(stack.size()>0) stack.pop();
                }
            }
            return stack;
        }
    }



}
