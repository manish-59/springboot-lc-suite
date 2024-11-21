package services;

import java.util.*;

public class LastStoneWeight {

    //1046

    public int lastStoneWeight(int[] stones) {

        int n = stones.length;
        while (n > 1) {
            Arrays.sort(stones);
            int x = stones[n - 1];
            int y = stones[n - 2];
            if (x == y) {
                n -= 2;
            } else {
                stones[n - 2] = Math.abs(x - y);
                n -= 1;
            }
        }
        return n == 0 ? 0 : stones[0];
    }

    //using priority queue
    public int lastStoneWeightHeap(int[] stones) {
        int len= stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<len;i++)
        {
            pq.add(stones[i]);
        }
        while(pq.size()!=1)
        {
            pq.add(pq.poll() - pq.poll());
        }
        return pq.peek();
    }
}
