package services;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {


    @Test
    public void testBinarySearch(){

        System.out.println(BinarySearch.search(new int[]{-1,0,3,5,9,12}, 9));
    }
}
