package services;

import models.ListNode;
import org.junit.jupiter.api.Test;

import static services.MergeKSortedLists.createLinkedList;

public class MergeKSortedListsTest {

    ReorderListTest reorderListTest = new ReorderListTest();

    @Test
    public void testMergeKLists(){

        ListNode res = MergeKSortedLists.mergeKLists(createLinkedListArray());
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    public ListNode[] createLinkedListArray() {

        ListNode[] listNode = new ListNode[4];

        for (int i = 0; i < 4; i++) {
            listNode[i] = createLinkedList(new int[]{1,2,3,4});
        }

        return listNode;
    }
}
