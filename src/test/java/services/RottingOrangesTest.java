package services;

import org.junit.jupiter.api.Test;

public class RottingOrangesTest {

    @Test
    public void testRottingOranges(){

        System.out.println(new RottingOranges().orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
    }
}
