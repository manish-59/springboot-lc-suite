package services;

import java.util.HashMap;

public class TwoSum {

    //1

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hsm  =new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(hsm.containsKey(complement)) return new int[]{hsm.get(complement), i};
            hsm.put(nums[i], i);
        }

        return new int[]{};
    }
}
