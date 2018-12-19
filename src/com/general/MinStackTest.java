package com.general;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 155. Min Stack
 */
public class MinStackTest {

    public static void main(String[] args) {

        //["MinStack","push","push","push","push","getMin","pop","getMin","pop","getMin","pop","getMin"]
        //[[],[2],[0],[3],[0],[],[],[],[],[],[],[]]
        //
        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin());;   //--> Returns -3.
//        minStack.pop();
//        System.out.println(minStack.top());    //--> Returns 0.
//        System.out.println(minStack.getMin()); //--> Returns -2.

        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }
}

class MinStack {

    private List<Integer> list;
    private Integer min;
    private Integer secondMin;

    /** initialize your data structure here. */
    public MinStack() {
        this.list = new ArrayList<Integer>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        return Collections.min(list);
    }
}

/**
 * Your MinStackTest object will be instantiated and called as such:
 * MinStackTest obj = new MinStackTest();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
