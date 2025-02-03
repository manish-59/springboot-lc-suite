package services;

import org.junit.jupiter.api.Test;

public class CountingBitsTest {

    @Test
    public void testCountingBits(){

        int[] ans = new CountingBits().countBits(5);
        for(int a: ans){
            System.out.println(a);
        }
    }
}
