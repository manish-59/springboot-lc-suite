package services;

import java.util.Arrays;

public class LongestConsecutive {

    public int longestConsecutiveSeq(int[] nums) {

        int res = 1;
        if(nums.length>0){
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            for(int i=1; i<nums.length-1;i++){
                if(nums[i]+1 == nums[i+1] && nums[i]-1 == nums[i-1]) res++;
            }
            return res+1;
        }
        else return 0;
    }
}
