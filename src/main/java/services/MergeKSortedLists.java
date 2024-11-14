package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKSortedLists {

    static {
        // Calling  with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            mergeKLists(new ListNode[0]);
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        List<Integer> intList = new ArrayList<>();

        for(ListNode ln: lists){
            while(ln!=null){
                intList.add(ln.val);
                ln=ln.next;
            }
        }

        int[] array = intList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(array);

        return createLinkedList(array);
    }

    public static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }
}
