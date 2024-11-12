package services;

import org.junit.jupiter.api.Test;

public class LongestConsecutiveTest {

    LongestConsecutive longestConsecutive  = new LongestConsecutive();

    @Test
    public void testLongestConsecutiveSeq(){

        System.out.println(longestConsecutive.longestConsecutiveSeq(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));
    }
}
