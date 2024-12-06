package services;

import org.junit.jupiter.api.Test;

public class SlidingWindowMedianTest {

    @Test
    public void testSlidingWindowMedian(){

        for(Double d: new SlidingWindowMedian().medianSlidingWindow(new int[]{2147483647,2147483647}, 2)){
            System.out.println(d);
        }
    }
}
