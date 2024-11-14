package services;

import org.junit.jupiter.api.Test;

public class SlidingWindowMaxTest {

    @Test
    public void testMaxSlidingWindow(){

        int[] res = SlidingWindowMax.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        for(int i:res){
            System.out.println(i);
        }
    }
}
