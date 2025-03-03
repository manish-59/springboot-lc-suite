package services;

import org.junit.jupiter.api.Test;

public class MinNoArrowsBalloonsTest {

    @Test
    public void testMinNoArrowsBalloons(){

        System.out.println(new MinNoArrowsBalloons().findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
    }
}
