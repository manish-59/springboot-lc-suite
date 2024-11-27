package services;

import models.ListNode;
import org.junit.jupiter.api.Test;

import static services.MergeKSortedLists.createLinkedList;

public class ReorderListTest {

    @Test
    public void testReorderList(){

        ListNode testList = createLinkedList(new int[]{1,2,3,4,5,6});

        ListNode testListReordered = ReorderList.reorderList(testList);

        while (testListReordered != null) {
            System.out.print(testListReordered.val + " ");
            testListReordered = testListReordered.next;
        }

    }
}
