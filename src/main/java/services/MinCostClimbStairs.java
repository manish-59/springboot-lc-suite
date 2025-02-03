package services;

public class MinCostClimbStairs {

    //746
    public int minCostClimbingStairs(int[] cost) {
        int maxIndex = cost.length;
        int[] dp = new int[maxIndex];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<maxIndex;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[maxIndex-1],dp[maxIndex-2]);
    }
}
