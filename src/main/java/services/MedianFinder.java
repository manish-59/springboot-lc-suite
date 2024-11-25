package services;

import java.util.*;

public class MedianFinder {

    //295

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

//    //using PQ
//    private PriorityQueue<Integer> secondHalf = new PriorityQueue<>(Comparator.reverseOrder());
//    private PriorityQueue<Integer> firstHalf = new PriorityQueue<>();
//    private boolean even = true;
//
//    public double findMedian() {
//        if (even)
//            return (secondHalf.peek() + firstHalf.peek()) / 2.0;
//        else
//            return secondHalf.peek();
//    }
//
//    public void addNum(int num) {
//        if (even) {
//            firstHalf.offer(num);
//            secondHalf.offer(firstHalf.poll());
//        } else {
//            secondHalf.offer(num);
//            firstHalf.offer(secondHalf.poll());
//        }
//        even = !even;
//    }
}
