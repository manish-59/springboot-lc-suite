package services;

import models.ListNode;
import org.junit.jupiter.api.Test;

import static services.LinkedListUtils.createLinkedList;

public class RemoveDupSortedLLTest {

    @Test
    public void testDeleteDuplicates(){

        ListNode rs = RemoveDupSortedLL.deleteDuplicates(createLinkedList(new int[]{1,1,2}));

        while (rs != null) {
            System.out.print(rs.val + " ");
            rs = rs.next;
        }
    }
}
