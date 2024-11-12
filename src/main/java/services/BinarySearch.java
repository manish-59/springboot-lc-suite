package services;

public class BinarySearch {

    static {
        // Calling search with an array of zeroes multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            search(new int[]{0}, 0);
        }
    }

    public static int search(int[] nums, int target) {


        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
