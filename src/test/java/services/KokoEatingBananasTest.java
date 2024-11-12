package services;

import org.junit.jupiter.api.Test;

public class KokoEatingBananasTest {

    @Test
    public void testMinEatingSpeed(){

        System.out.println(KokoEatingBananas.minEatingSpeed(new int[]{805306368,805306368,805306368}, 1000000000));
    }
}
