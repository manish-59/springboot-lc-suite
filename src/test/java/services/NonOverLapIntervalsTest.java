package services;

import org.junit.jupiter.api.Test;

public class NonOverLapIntervalsTest {

    @Test
    public void testNonOverLapIntervals(){

        System.out.println(new NonOverLapIntervals().eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
    }
}
