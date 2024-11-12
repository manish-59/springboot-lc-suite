package services;

import org.junit.jupiter.api.Test;

public class CarFleetTest {

    @Test
    public void testCarFleet(){

        System.out.println(CarFleet.carFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}));
    }
}
