package services;

import org.junit.jupiter.api.Test;

public class MaxSubArrayGreedyTest {

    @Test
    public void testMaxSubArrayGreedy(){

        System.out.println(new MaxSubArrayGreedy().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
