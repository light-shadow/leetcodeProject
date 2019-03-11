package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 206. Reverse Linked List
 */
public class ReverseLinkedList {

    private static ListNode node;

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        node.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;
        reverseList(node);

    }

    public static ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        if(list.size()>0){
            ListNode node = new ListNode(list.get(0));
            for(int i=1;i<list.size();i++){
                insert(node, list.get(i));
            }
            return node;
        }
        else{
            return null;
        }
    }

    public static void insert(ListNode node, int data) {
        if (node == null) {
            node = new ListNode(data);
            return;
        }
        ListNode cur = node;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(data);
    }

}
