package services;

import org.junit.jupiter.api.Test;

import static services.MergeKSortedLists.createLinkedList;

public class ReverseNodesKGroupTest {

    @Test
    public void testReverseKGroup(){


        ListNode testList = createLinkedList(new int[]{1,2,3,4,5});

        ListNode testNode = ReverseNodesKGroup.reverseKGroup(testList, 3);

        while (testNode != null) {
            System.out.print(testNode.val + " ");
            testNode = testNode.next;
        }
    }
}
