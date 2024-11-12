package services;

import java.util.Arrays;

public class MedianSlidingWindow {

    public double[] medianSlidingWindow(int[] nums, int k) {

        double[] res = new double[nums.length-k+1];

        for(int i = 0; i < nums.length-k+1; i++){

            int[] numWind = new int[k];
            for(int m=0, j=i; j<i+k; m++, j++){
                numWind[m] = nums[j];
            }
            res[i] = findMedian(numWind);
        }
        return res;
    }

    public double findMedian(int[] numWind){

        double med = 0.0;

        if(numWind == null || numWind.length == 0) return med;
        Arrays.sort(numWind);
        if(numWind.length%2 != 0) med = numWind[numWind.length/2];
        else med = ((long)numWind[numWind.length/2] + (long)numWind[numWind.length/2 - 1])/2.0;

        return med;
    }
}
