package services;

public class MaxSubArrayGreedy {

    //53
    //Kadane's Algo

    public int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            maxSum = currentSum > maxSum ? currentSum : maxSum;

            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
