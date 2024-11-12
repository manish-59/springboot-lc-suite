package services;

public class SearchRotatedSortedArray {

    static {
        // Calling with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            search(new int[]{0}, 0);
        }
    }

    public static int search(int[] nums, int target) {

        int start=0;
        int end= nums.length-1;
        int pivot = findPivot(nums);

        if(pivot == -1) return bs(nums, target, start, end);
        if(target == nums[pivot]) return pivot;
        if(target>=nums[start]) return bs(nums, target, start, pivot-1);
        else return bs(nums, target, pivot+1, end);
    }

    public static int findPivot(int[] nums){
        int start=0;
        int end= nums.length-1;

        while(start<= end){
            int mid= start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid+1]){ // got pivot
                return mid;
            }
//            case2
            if(mid > start && nums[mid] <nums[mid-1]){  // got pivot
                return mid -1;
            }
            if(nums[mid] <= nums[start]){  // pivot lies in first half
                end = mid - 1;
            }else{  // pivot lies in second half
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int bs(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid= start + (end - start) / 2;
            if(nums[mid] > target){
                end= mid -1;
            }else if(nums[mid] < target){
                start= mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
