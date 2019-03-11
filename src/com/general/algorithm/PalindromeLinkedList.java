package com.general.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. Palindrome Linked List
 * status:
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(-129);
        ListNode node1 = new ListNode(-129);
        node.next = node1;
        System.out.println(isPalindrome(node));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        if(list.size()==0){
            return true;
        }
        int length = list.size();

        int half = length/2;
        for(int i=0;i<half;i++){
            int now = list.get(i);
            int next = list.get(length-i-1);

            if(now != next){
                return false;
            }
        }
        return true;
    }


}




