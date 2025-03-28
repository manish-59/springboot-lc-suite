package services;

import models.ListNode;

public class RemoveDupSortedLL {

    //83

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}
