package services;

import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {

    @Test
    public void testCanPlaceFlowers(){

        System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
}
