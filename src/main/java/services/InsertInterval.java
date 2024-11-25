package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {

    //57

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] newIntervals = new int[intervals.length + 1][2];
        System.arraycopy(intervals, 0, newIntervals, 0, intervals.length);
        newIntervals[intervals.length] = newInterval;
        return merge(newIntervals);
    }

    private int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for (int i = 1; i < intervals.length; ++i) {
            int s = intervals[i][0], e = intervals[i][1];
            if (ans.getLast()[1] < s) {
                ans.add(intervals[i]);
            } else {
                ans.getLast()[1] = Math.max(ans.getLast()[1], e);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
