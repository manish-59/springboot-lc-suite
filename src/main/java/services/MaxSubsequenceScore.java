package services;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxSubsequenceScore {

    //https://leetcode.com/problems/smallest-number-in-infinite-set/solutions/6124375/beats-100-proof-beginner-freindly-java-concise-code/?envType=study-plan-v2&envId=leetcode-75
    //2542
        public long maxScore(int[] speed, int[] efficiency, int k) {
            int n = speed.length;
            int[][] ess = new int[n][2];

            for (int i = 0; i < n; ++i)
                ess[i] = new int[] { efficiency[i], speed[i] };

            Arrays.sort(ess, (a, b) -> b[0] - a[0]);

            PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);

            long res = 0, sumS = 0;

            for (int[] es : ess) {
                pq.add(es[1]);
                sumS = (sumS + es[1]);

                if (pq.size() > k)
                    sumS -= pq.poll();
                if (pq.size() == k)
                    res = Math.max(res, (sumS * es[0]));
            }

            return res;
        }
}
