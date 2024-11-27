package services;

import models.ListNode;

public class PartitionList {

    //86

    public static ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1);
        ListNode great = new ListNode(-1);
        ListNode rootL = less;
        ListNode rootG = great;

        while(head != null){
            if(head.val < x){
                ListNode node = new ListNode(head.val);
                less.next = node;
                less = less.next;
            }
            else{
                ListNode node = new ListNode(head.val);
                great.next = node;
                great = great.next;
            }
            head = head.next;
        }
        less.next = rootG.next;
        return rootL.next;
    }
}
