package com.general.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 876. Middle of the Linked List
 * status: pass
 */
public class MiddleoftheLinkedList {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head !=null){
            list.add(head.val);
            head = head.next;
        }
        int index = list.size()/2;
        ListNode  newLinkedList = new ListNode(list.get(index));
        for(int i=index+1;i<list.size();i++){
            insert(newLinkedList, list.get(i));
        }
        return newLinkedList;
    }

    /**
     * 在单链表中插入新的节点
     * @param node
     * @param data
     */
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
