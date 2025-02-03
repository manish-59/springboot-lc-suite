package services;

import java.util.PriorityQueue;

public class TotalCostKWorkers {

    //2462

    public long totalCost(int[] costs, int k, int candidates) {

        PriorityQueue<Integer> front = new PriorityQueue<>();
        PriorityQueue<Integer> back = new PriorityQueue<>();

        int frontIndex = 0;
        int backIndex = costs.length - 1;

        long res = 0;
        while (k-- > 0) {
            while (front.size() < candidates && frontIndex <= backIndex)
                front.add(costs[frontIndex++]);
            while (back.size() < candidates && frontIndex <= backIndex)
                back.add(costs[backIndex--]);

            Integer frontPeek = front.size() > 0 ? front.peek() : Integer.MAX_VALUE;
            Integer backPeek = back.size() > 0 ? back.peek() : Integer.MAX_VALUE;

            // check which heap has the smaller one
            if (frontPeek <= backPeek)
                res += front.remove(); // add the selected candidate cost to res
            else if (frontPeek > backPeek)
                res += back.remove(); // add the selected candidate cost to res
        }
        return res;
    }
}
