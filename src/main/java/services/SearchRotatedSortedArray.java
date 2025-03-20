package services;

public class SearchRotatedSortedArray {

    //33

    public int search(int[] nums, int target) {

        int low = 0, high = nums.length-1;

        while(low<=high){

            int mid = low + (high-low)/2;
            if(target == nums[mid]) return mid;
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target &&  target <= nums[mid]) high = mid-1;
                else low = mid+1;
            }else{
                if(nums[mid] <= target && target <= nums[high]) low = mid+1;
                else high = mid-1;
            }
        }

        return -1;
    }
}
