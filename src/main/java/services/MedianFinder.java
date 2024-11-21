package services;

//295

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianFinder {

    List<Integer> nums;

    public MedianFinder() {
        this.nums = new ArrayList<>();
    }

    public void addNum(int num) {
        this.nums.add(num);
    }

    public double findMedian() {

        return helper(this.nums.stream().mapToInt(Integer::intValue).toArray());
    }

    public double helper(int[] numWind){

        double med = 0.0;

        if(numWind == null || numWind.length == 0) return med;
        Arrays.sort(numWind);
        if(numWind.length%2 != 0) med = numWind[numWind.length/2];
        else med = ((long)numWind[numWind.length/2] + (long)numWind[numWind.length/2 - 1])/2.0;

        return med;
    }
}
