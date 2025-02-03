package services;

import org.junit.jupiter.api.Test;

public class KokoEatingBananasTest {

    @Test
    public void testMinEatingSpeed(){

        System.out.println(KokoEatingBananas.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }
}
