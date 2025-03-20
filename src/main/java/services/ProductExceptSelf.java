package services;

public class ProductExceptSelf {

    //238
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i=1; i<nums.length; i++){
            res[i] = res[i-1] * nums[i-1];
        }

        int product = 1;
        for(int i=nums.length-1; i>=0; i--){
            res[i] *= product;
            product *= nums[i];
        }
        return res;
    }
}
