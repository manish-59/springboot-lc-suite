package services;

public class Rm1ElemMakeIncreasing {

    //1909

    public boolean canBeIncreasing(int[] nums) {

        int ctr=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) {
                ctr++;
            }
        }


        return ctr == (nums.length-2);
    }
}
