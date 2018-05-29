package com.general;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        // 定义第一个节点
        Solution solution = new Solution();
        ListNode listNode1A = new ListNode(2);
        ListNode listNode1B = new ListNode(4);
        ListNode listNode1C = new ListNode(3);
        listNode1A.next = listNode1B;
        listNode1B.next = listNode1C;
        // 定义第二个节点
        ListNode listNode2A = new ListNode(5);
        ListNode listNode2B = new ListNode(6);
        ListNode listNode2C = new ListNode(4);
        listNode2A.next = listNode2B;
        listNode2B.next = listNode2C;
//        System.out.println(solution.addTwoNumbers(listNode1A,  listNode2A));


        ListNode listNode3A = new ListNode(9);
        ListNode listNode4A = new ListNode(1);
        ListNode listNode4B = new ListNode(9);

        ListNode listNode4C = new ListNode(9);
        ListNode listNode4D = new ListNode(9);

        ListNode listNode4E = new ListNode(9);
        ListNode listNode4F = new ListNode(9);
        ListNode listNode4G = new ListNode(9);
        ListNode listNode4H = new ListNode(9);
        ListNode listNode4I = new ListNode(9);
        ListNode listNode4J = new ListNode(9);
        listNode4A.next = listNode4B;
        listNode4B.next = listNode4C;
        listNode4C.next = listNode4D;
        listNode4D.next = listNode4E;
        listNode4E.next = listNode4F;
        listNode4F.next = listNode4G;
        listNode4G.next = listNode4H;
        listNode4H.next = listNode4I;
        listNode4I.next = listNode4J;
        System.out.println(solution.addTwoNumbers(listNode3A, listNode4A));
    }

}

/**
 * Definition for singly-linked list.
*/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x){ val = x;}
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        double sum = getInteger(l1) + getInteger(l2);
        Integer sumP = (int) sum;
        Integer last = (int)sum %10;
        ListNode listNode = new ListNode(0);
        List<Integer> numberList = new ArrayList<Integer>();
        double a = sum;
        if(a==0){
            return listNode;
        }
        while(a!=0){
            numberList.add((int)a%10);
            a /= 10;
        }

        System.out.println(numberList);
        ListNode current  = listNode;
        for (Integer num: numberList) {
            ListNode each = new ListNode(num);
            current.next = each;
            current = each;
        }
        return listNode.next;
    }
    public double getInteger(ListNode listNode){
        double sum1 = listNode.val;
        Integer count1 = 0;
        while(listNode.next!=null){
            count1++;
            sum1 += listNode.next.val*Math.pow(10, count1);
            listNode = listNode.next;
        }
        return sum1;
    }
}