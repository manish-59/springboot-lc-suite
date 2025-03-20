package services.random;

public class Trial {

    public static int[] searchRange(int[] nums, int target) {

        int first = findTarget(nums, target, true);
        int last = findTarget(nums, target, false);
        return new int[]{first, last};
    }

    public static int findTarget(int[] nums, int target, boolean findFirst){

        int l=0;
        int r= nums.length-1;
        int position = -1;

        int mid=0;
        while(l<=r){

            mid = l + (r-l)/2;

            if(nums[mid] == target){
                position = mid;
                if (findFirst) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            }else if(nums[mid]>target){
                r = mid-1;
            }else{
                l=mid+1;
            }

        }

        return position;
    }

    public static void main(String[] args){


        for(Integer e: searchRange(new int[]{5,7,7,8,8,10}, 8)){
            System.out.println(e);
        }
    }
}
