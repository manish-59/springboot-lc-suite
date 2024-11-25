package services;

import java.util.*;

public class MinIntervalQuery {

    //1851

    public int[] minInterval(int[][] intervals, int[] queries) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        Map<Integer, Integer> res = new HashMap<>();
        int i = 0;
        for (int q : Arrays.stream(queries).sorted().toArray()) {
            while (i < intervals.length && intervals[i][0] <= q) {
                int l = intervals[i][0];
                int r = intervals[i][1];
                minHeap.offer(new int[]{r - l + 1, r});
                i++;
            }

            while (!minHeap.isEmpty() && minHeap.peek()[1] < q) {
                minHeap.poll();
            }
            res.put(q, minHeap.isEmpty() ? -1 : minHeap.peek()[0]);
        }
        int[] result = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            result[j] = res.get(queries[j]);
        }
        return result;
    }

    public int[] minIntervalPQ(int[][] intervals, int[] queries) {
        HashMap<Integer, Integer> map= new HashMap<>();
        Arrays.sort(intervals, (x,y)-> (x[0]-y[0]));
        int arr[]= new int[queries.length], i=0;
        PriorityQueue<int[]> pq= new PriorityQueue<>((x, y)->((x[1]-x[0])-(y[1]-y[0])));
        for(int j=0; j<arr.length; j++) arr[j]=queries[j];
        Arrays.sort(arr);
        for(int q : arr){
            while(i < intervals.length && intervals[i][0]<=q){
                pq.offer(intervals[i++]);
            }
            while(pq.size()!=0 && pq.peek()[1]<q){
                pq.poll();
            }
            map.put(q, (pq.size()==0 ? -1 : pq.peek()[1]-pq.peek()[0]+1));
        }
        for(i=0; i<queries.length; i++){
            queries[i]= map.get(queries[i]);
        }
        return queries;
    }

    public int[] minIntervalBrute(int[][] intervals, int[] queries) {

        int[] res = new int[queries.length];
        Arrays.fill(res, -1);

        for(int i =0; i<queries.length; i++){
            for(int[] intr: intervals){
                int size = intr[1] - intr[0] + 1;
                if(intr[0] <= queries[i] && queries[i] <= intr[1]){
                    if(res[i] == -1){
                        res[i] = size;
                    }else{
                        res[i] = Math.min(res[i], size);
                    }
                }
            }
        }
        return res;
    }
}
