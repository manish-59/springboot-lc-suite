package services;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        int res = -1;
        Arrays.sort(coins);
        res = calculateCoin(coins, amount);
        return res;
    }

    public int calculateCoin(int[] coins, int amount){

        if(amount == 0) {
            return 0;
        }
        if(amount < 0) {
            return Integer.MAX_VALUE;
        }
        int minCoins = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++) {
            int ans = calculateCoin(coins, amount - coins[i]);

            if(ans != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, 1 + ans);
            }
        }
        return minCoins;
    }
}
