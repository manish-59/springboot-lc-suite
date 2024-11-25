package services;

import org.junit.jupiter.api.Test;

class GasStationGreedyTest {

    @Test
    public void canCompleteCircuit() {

        System.out.println(new GasStationGreedy().canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
    }
}