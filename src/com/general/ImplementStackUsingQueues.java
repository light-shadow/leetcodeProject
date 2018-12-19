package com.general;

import java.util.LinkedList;

/**
 * 225. Implement Stack using Queues
 */
public class ImplementStackUsingQueues {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());  // returns 2
        System.out.println(stack.empty());// returns false
    }
}

class MyStack {

    private LinkedList<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        this.queue = queue;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        this.queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return this.queue.removeLast();
    }

    /** Get the top element. */
    public int top() {
        return this.queue.getLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.queue.size()==0;
    }
}

