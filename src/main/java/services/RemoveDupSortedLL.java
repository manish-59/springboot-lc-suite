package services;

public class RemoveDupSortedLL {

    //83

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next; // move the temp pointer only if next value is not also equal to the current temp val
            }
        }
        return head;
    }
}
