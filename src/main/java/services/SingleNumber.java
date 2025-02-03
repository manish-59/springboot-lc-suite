package services;

public class SingleNumber {

    //136

    public int singleNumber(int[] nums) {

        return res(0,nums);
    }

    public static int res(int k, int[] nums){
        if(k==nums.length) return 0;
        return nums[k] ^ res(k+1,nums);
    }
}
