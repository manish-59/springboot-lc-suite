package services;

import models.Interval;

import java.util.*;

public class MeetingRoomsII {

    //all 4 solutions has same time space complexity - TC - O(nlogn) and SC - O(n)

    //253
    //MinHeap
    public int minMeetingRooms(List<Interval> intervals) {

        intervals.sort(Comparator.comparingInt(a -> a.start));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (Interval interval : intervals) {
            if (!minHeap.isEmpty() && minHeap.peek() <= interval.start) {
                minHeap.poll();
            }
            minHeap.offer(interval.end);
        }
        return minHeap.size();
    }

    //SweepLineAlg
    public int minMeetingRooms2(List<Interval> intervals) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Interval i : intervals) {
            mp.put(i.start, mp.getOrDefault(i.start, 0) + 1);
            mp.put(i.end, mp.getOrDefault(i.end, 0) - 1);
        }
        int prev = 0;
        int res = 0;
        for (int key : mp.keySet()) {
            prev += mp.get(key);
            res = Math.max(res, prev);
        }
        return res;
    }

    //2Pointers
    public int minMeetingRooms3(List<Interval> intervals) {
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int res = 0, count = 0, s = 0, e = 0;
        while (s < n) {
            if (start[s] < end[e]) {
                s++;
                count++;
            } else {
                e++;
                count--;
            }
            res = Math.max(res, count);
        }
        return res;
    }

    //Greedy
    public int minMeetingRooms4(List<Interval> intervals) {
        List<int[]> time = new ArrayList<>();
        for (Interval i : intervals) {
            time.add(new int[] { i.start, 1 });
            time.add(new int[] { i.end, -1 });
        }

        time.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int res = 0, count = 0;
        for (int[] t : time) {
            count += t[1];
            res = Math.max(res, count);
        }
        return res;
    }

}
