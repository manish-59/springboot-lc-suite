package services;

import org.junit.jupiter.api.Test;

public class MinRotatedSortedArrayTest {

    @Test
    public void testFindMin(){

        MinRotatedSortedArray mrsa = new MinRotatedSortedArray();
        System.out.println(mrsa.findMin(new int[]{11,13,15,17}));
    }
}
