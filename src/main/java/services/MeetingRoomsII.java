package services;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRoomsII {

    //253
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
}
