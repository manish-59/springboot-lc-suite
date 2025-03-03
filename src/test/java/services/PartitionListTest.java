package services;

import models.ListNode;
import org.junit.jupiter.api.Test;

import static services.LinkedListUtils.createLinkedList;

public class PartitionListTest {

    @Test
    public void testPartition(){

        ListNode testList = createLinkedList(new int[]{1,4,3,2,5,2});

        ListNode ansList = PartitionList.partition(testList, 3);

        while (ansList != null) {
            System.out.print(ansList.val + " ");
            ansList = ansList.next;
        }
    }
}
