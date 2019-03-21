package com.general.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 83. Remove Duplicates from Sorted List
 * status:
 */
public class RemoveDuplicatesfromSortedList {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head !=null){
            int val = head.val;
            if(!list.contains(val)){
                list.add(val);
            }
        }
        ListNode first = new ListNode(list.get(0));
        for(int i=1;i<list.size();i++){
            insert(first, list.get(i));
        }
        return first;
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
