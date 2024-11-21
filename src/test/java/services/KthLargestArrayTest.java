package services;

import org.junit.jupiter.api.Test;

public class KthLargestArrayTest {

    KthLargestArray kLA = new KthLargestArray();

    @Test
    public void testFindKthLargest(){

        System.out.print(kLA.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
