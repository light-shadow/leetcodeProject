package com.general.algorithm;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 */
public class ValidParentheses {


    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";
        String test6 = "]";
        String test7 = "}";
        String test8 = ")";
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(test1));
        System.out.println(validParentheses.isValid(test2));
        System.out.println(validParentheses.isValid(test3));
        System.out.println(validParentheses.isValid(test4));
        System.out.println(validParentheses.isValid(test5));
        System.out.println(validParentheses.isValid(test6));
        System.out.println(validParentheses.isValid(test7));
        System.out.println(validParentheses.isValid(test8));


    }

    public boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }
        else{
            Stack<String> stringStack = new Stack<String>();
            String s1 = "";
            for(int i=0;i<s.length();i++){
                String each = s.substring(i, i+1);
                if(each.equals("(") || each.equals("[") || each.equals("{")) {
                    stringStack.push(each);
                }else{
                    if(stringStack.size() == 0){
                        return false;
                    }
                    if(each.equals(")")){
                        s1 = stringStack.pop();
                        if(!s1.equals("(")){
                            return false;
                        }
                    }
                    if(each.equals("]")){
                        s1 = stringStack.pop();
                        if(!s1.equals("[")){
                            return false;
                        }
                    }
                    if(each.equals("}")) {

                        s1 = stringStack.pop();
                        if(!s1.equals("{")){
                            return false;
                        }
                    }
                }
            }
            if(stringStack.size() >0){
                return false;
            }
            return true;
        }
    }
}
