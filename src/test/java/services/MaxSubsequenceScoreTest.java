package services;

import org.junit.jupiter.api.Test;

public class MaxSubsequenceScoreTest {

    MaxSubsequenceScore mss = new MaxSubsequenceScore();

    @Test
    public void testMaxSubsequenceScore(){

        System.out.println(mss.maxScore(new int[]{1,3,3,2}, new int[]{2,1,3,4}, 3));
    }
}
