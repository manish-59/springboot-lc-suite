package services;

import org.junit.jupiter.api.Test;

public class CoinChangeTest {

    @Test
    public void testCoinChange(){

        CoinChange cc = new CoinChange();
        System.out.println(cc.calculateCoin(new int[]{1,2,5}, 11));
    }
}
