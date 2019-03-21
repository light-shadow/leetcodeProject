package com.general.algorithm;


/**
 * 83. Remove Duplicates from Sorted List
 * status: pass
 * refrence: https://blog.csdn.net/happyaaaaaaaaaaa/article/details/48920813
 */
public class RemoveDuplicatesfromSortedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(2);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        while(head != null && head.next!=null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return newHead;
    }
}
