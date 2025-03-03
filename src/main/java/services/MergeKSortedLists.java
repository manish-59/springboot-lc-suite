package services;

import models.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static services.LinkedListUtils.createLinkedList;

public class MergeKSortedLists {

    static {
        // Calling  with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            mergeKLists(new ListNode[0]);
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        int[] array = toIntArr(lists);
        Arrays.sort(array);

        return createLinkedList(array);
    }

    public static int[] toIntArr(ListNode[] lists){
        List<Integer> intList = new ArrayList<>();

        for(ListNode ln: lists){
            while(ln!=null){
                intList.add(ln.val);
                ln=ln.next;
            }
        }

        int[] array = intList.stream().mapToInt(i -> i).toArray();

        return array;
    }
}
