package services;

import models.ListNode;

public class RotateList {

    //61

    public static ListNode rotateRight(ListNode head, int k) {

        ListNode res = new ListNode();
        if(k==0) return head;
        //convert to circular LL
        //break C ll after size-k from head, and make break node as head

        ListNode temp = head;
        int size = 0;
        while(temp.next!=null){
            size++;
            temp = temp.next;
        }
        temp.next = head;

        for(int i=0; i<size+1; i++){
        }

        return res;
    }
}
