package com.general.algorithm;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 */
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // returns 1
        System.out.println(queue.pop());  // returns 1
        System.out.println(queue.empty()); // returns false
    }
}

class MyQueue {

    Stack<Integer> stack;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        return stack.remove(0);
    }

    /** Get the front element. */
    public int peek() {
        return stack.firstElement();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.stack.size() == 0;
    }
}
