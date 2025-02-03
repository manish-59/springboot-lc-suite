package services;

public class CountingBits {

    //338

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;  // Base case: 0 has 0 set bits

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}
