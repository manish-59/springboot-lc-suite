package services;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestArray {

    //215

    public int findKthLargest(int[] nums, int k) {

        int len= nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<len;i++)
        {
            pq.add(nums[i]);
        }
        for(int i=0; i<k-1; i++){
            pq.poll();
        }

        return pq.peek();
    }
}
