package com.general;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * 224 Basic Calculator
 */
public class BasicCalculator {

    public static void main(String[] args) {
        String expression = "1 + 1";
        String expression1 = "(6+8+1)";
//        System.out.println(calulate(expression1));

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals("(")){}
            else if(s.equals("+")) {ops.push(s); }
            else if(s.equals("-")) {ops.push(s); }
            else if(s.equals("*")) {ops.push(s); }
            else if(s.equals("/")) {ops.push(s); }
            else if(s.equals("sqrt")) {ops.push(s);}
            else if(s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if(op.equals("+")){v = vals.pop() + v;}
                else if(op.equals("-")){v = vals.pop() - v;}
                else if(op.equals("*")){v = vals.pop() * v;}
                else if(op.equals("/")){v = vals.pop() / v;}
                else if(op.equals("sqrt")){v = Math.sqrt(v);}
                vals.push(v);
            }
            else {vals.push(Double.parseDouble(s));}
        }
        StdOut.println(vals.pop());

    }




    private static long calulate(String expression){
        Stack<String> ops = new Stack<String>();
        Stack<Long> vals = new Stack<Long>();
        int length = expression.length();
        for(int i=0; i< length; i++){
            String each = expression.substring(i,i+1);
            if(("(").equals(each)){
            } else  if(("+").equals(each)){
                ops.push(each);
            } else if(("-").equals(each)){
                ops.push(each);
            } else if((")").equals(each)){
                String op = ops.pop();
                long val = vals.pop();
                if("+".equals(op)){
                    val = vals.pop() + val;
                } else if("-".equals(op)){
                    val = vals.pop() - val;
                }
                vals.push(val);
            } else if(" ".equals(each)){

            }else{
                vals.push(Long.parseLong(each));
            }
        }
        return vals.pop();
    }
}
