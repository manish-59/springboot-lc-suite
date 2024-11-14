package services;

public class ReorderList {

    //143

    public static ListNode reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        //find mid
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = fast.next;
        ListNode fastReversed = null;

        //reverse 2nd half
        while(slow.next !=null){

            ListNode temp = slow.next.next;
            slow.next.next = fastReversed;
            fastReversed = slow.next;
            slow.next = temp;
        }

        //merge first and second half
        while(fastReversed !=null){

            ListNode temp = head.next;
            ListNode temp2 = fastReversed.next;
            head.next = fastReversed;
            head.next.next = temp;
            fastReversed = temp2;
        }

        return head;
    }
}
