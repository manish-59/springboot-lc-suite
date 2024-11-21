package services;

import java.util.*;

public class KClosest2Origin {

    //973

    public int[][] kClosest(int[][] points, int k) {
        int ans [][] = new int [k][2];
        PriorityQueue<int[]> maxheap = new PriorityQueue<>(
                (a,b)->Integer.compare(b[0]*b[0]+b[1]*b[1] , a[0]*a[0]+a[1]*a[1])
        );
        for(int [] point : points ){
            maxheap.offer(point);
            if(maxheap.size() > k){
                maxheap.poll();
            }
        }
        for(int i = 0 ; i < k ; i++){
            ans[i] = maxheap.poll();
        }
        return ans;


    }
}