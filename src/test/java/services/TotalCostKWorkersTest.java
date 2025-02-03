package services;

import org.junit.jupiter.api.Test;

public class TotalCostKWorkersTest {

    @Test
    public void testTotalCostKWorkers(){

        System.out.println(new TotalCostKWorkers().totalCost(new int[]{17,12,10,2,7,2,11,20,8}, 3,4));
    }
}
