package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 21. Merge Two Sorted Lists
 * status: pass
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        while(l1!=null){
            list.add(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            list.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(list);
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
