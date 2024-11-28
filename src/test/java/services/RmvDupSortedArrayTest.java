package services;

import org.junit.jupiter.api.Test;

public class RmvDupSortedArrayTest {

    @Test
    public void testRmvDupSortedArray(){

        System.out.println(new RmvDupSortedArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
