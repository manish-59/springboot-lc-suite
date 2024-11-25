package services;

import java.util.PriorityQueue;

public class DivArrayKConsecutive {

    //1296
    //same as 846

    public boolean isPossibleDivide(int[] nums, int k) {

        if(nums.length%k != 0){
            return false;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int h: nums){
            pq.add(h);
        }

        while(!pq.isEmpty()){
            int el=pq.poll();

            for(int i=1;i<k;i++){
                if(!pq.remove(el+i)){
                    return false;
                }
            }
        }
        return true;
    }
}
