package services;

import org.junit.jupiter.api.Test;

class HandOfStraightsTest {

    @Test
    public void isNStraightHand() {

        System.out.println(new HandOfStraights().isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
    }
}