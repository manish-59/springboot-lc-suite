package services;

import org.junit.jupiter.api.Test;

public class SearchRotatedSortedArrayTest {

    @Test
    public void testSearch(){

        SearchRotatedSortedArray srsa = new SearchRotatedSortedArray();
        System.out.println(srsa.search(new int[]{4,5,6,7,0,1,2}, 3));
    }
}
