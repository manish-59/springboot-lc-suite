package services;

public class DominoTromino {

//    790
//    Maths behind
//    dp[n]=dp[n−1]+dp[n−2]+2×(dp[n−3]+dp[n−4]+⋯+dp[0])
//=>  dp[n]=2×dp[n−1]+dp[n−3]

    public int numTilings(int n) {
        long mod=1000000007;
        if(n==1) return 1;
        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=2;i<n;i++){
            dp[i+1]=(dp[i-2]+2*dp[i])%mod;
        }

        return (int)dp[n];
    }
}
