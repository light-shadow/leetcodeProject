package com.general.datastructure;

/**
 * 使用链表实现队列
 * 队列的入队 出队
 */
public class QueueTest{
    public static void main(String[] args) {
        Node head = new Node(3);
        Node middle = new Node(4, null, head);
        Node tail = new Node(5, null, middle);
        head.setNext(middle);
        middle.setNext(tail);
        Queue queue = new Queue(head);
        System.out.println(queue.toString());
        Node node1 = new Node(8);
        queue.enqueue(node1);
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
//        queue.getFirstNode();
//        queue.getLastNode();

    }
}


class Queue {

    private Node node;
    private Node head;
    private Node tail;

    public Queue(Node node) {
        this.node = node;
        this.head = getFirstNode();
        this.tail = getLastNode();
    }

    public Node getFirstNode(){
        return this.node;
    }

    public Node getLastNode(){
        Node next = node.getNext();
        Node tmp = null;
        while(next!=null){
            tmp = next;
            next = next.getNext();
        }
        return tmp;
    }

    public void enqueue(Node node){
        tail.setNext(node);
        node.setNext(null);
        tail = node;
    }

    public Node dequeue(){
        Node returnNode = head;
        head = head.getNext();
        return returnNode;
    }

    public void print(){
        Integer data = head.getData();
        Node next = head.getNext();
        System.out.print(data+"--->");
        while(next != null){
            next = next.getNext();
            System.out.print(next.getData()+"--->");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Integer data = head.getData();
        Node next = head.getNext();
        sb.append(data);
        while(next != null){
            sb.append("-->").append(next.getData());
            next = next.getNext();
        }
        return sb.toString();
    }
}



class Node{

    private Integer data;

    private Node  next;

    private Node previous;

    public Node(Integer data) {
        this(data, null, null);
    }

    public Node(Integer data, Node next){
        this(data, next, null);
    }

    public Node(Integer data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }



    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}