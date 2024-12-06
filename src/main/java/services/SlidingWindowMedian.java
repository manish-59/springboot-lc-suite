package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlidingWindowMedian {

    //480

    public double[] medianSlidingWindow(int[] nums, int k) {
        List<Double> median = new ArrayList<>();
        List<Integer> deque = new ArrayList<>();

        for (int i = 0; i < k - 1; i++) {
            deque.add(nums[i]);
        }
        Collections.sort(deque);

        int j = k - 1;
        int i = 0;

        while (j < nums.length) {
            insertNumber(nums[j], deque);
            median.add(findMedian(deque));
            removeNumber(nums[i], deque);
            i++;
            j++;
        }

        return median.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public void insertNumber(int n, List<Integer> dq){

        int idx = Collections.binarySearch(dq, n);
        if (idx < 0) idx = -idx - 1;
        dq.add(idx, n);
    }

    public void removeNumber(int n, List<Integer> dq) {

        int idx = Collections.binarySearch(dq, n);
        if (idx < 0) idx = -idx - 1;
        dq.remove(idx);
    }

    public double findMedian(List<Integer> dq) {
        int size = dq.size();
        int idx1 = size / 2;
        double median;

        if (size % 2 == 1) {
            median = dq.get(idx1);
        } else {
            int idx2 = idx1 - 1;
            long sum = (long) dq.get(idx1) + (long) dq.get(idx2);
            median = sum / 2.0;
        }

        return median;
    }
}
