package services;

import org.junit.jupiter.api.Test;

public class LastStoneWeightTest {

    LastStoneWeight lsw = new LastStoneWeight();

    @Test
    public void testLastStoneWeight(){

        System.out.print(lsw.lastStoneWeight(new int[]{9,3,2,10}));
    }
}
