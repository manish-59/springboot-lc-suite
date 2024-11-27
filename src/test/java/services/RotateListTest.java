package services;

import models.ListNode;
import org.junit.jupiter.api.Test;
import static services.MergeKSortedLists.createLinkedList;

public class RotateListTest {

    @Test
    public void testRotateRight(){

        ListNode res = RotateList.rotateRight(createLinkedList(new int[]{1,2,3,4,5}), 2);

        while(res!=null){
//            System.out.println(res.val);
            res=res.next;
        }
    }
}
