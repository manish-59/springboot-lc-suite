package services;

import java.util.PriorityQueue;

public class SmallestInfiniteSet {

    //2336

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public SmallestInfiniteSet() {
        for(int i=1;i<1001;i++)
            pq.add(i);
    }

    public int popSmallest() {

        return pq.poll();
    }

    public void addBack(int num) {

        if(pq.contains(num)) return;
        else pq.add(num);

    }
}
