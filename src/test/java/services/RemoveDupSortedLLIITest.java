package services;

import models.ListNode;
import org.junit.jupiter.api.Test;

import static services.MergeKSortedLists.createLinkedList;

public class RemoveDupSortedLLIITest {

    @Test
    public void testDeleteDuplicates(){

        ListNode rs = RemoveDupSortedLLII.deleteAllDuplicates(createLinkedList(new int[]{1,2,2,3,4,4,5}));

        while (rs != null) {
            System.out.print(rs.val + " ");
            rs = rs.next;
        }
    }
}
