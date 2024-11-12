package services;

import java.util.Arrays;

public class MinRotatedSortedArray {

    static {
        // Calling maxArea with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            findMin(new int[]{0});
        }
    }

    public static int findMin(int[] nums) {

        Arrays.sort(nums);

        return nums[0];
    }
}
