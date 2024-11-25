package services;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class HandOfStraights {

    //846
    //same as 1296

    public boolean isNStraightHand(int[] hand, int groupSize) {


        if(hand.length%groupSize != 0){
            return false;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int h: hand){
            pq.add(h);
        }

        while(!pq.isEmpty()){
            int el=pq.poll();

            for(int i=1;i<groupSize;i++){
                if(!pq.remove(el+i)){
                    return false;
                }
            }
        }
        return true;
    }
}
