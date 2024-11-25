package services;

public class JumpGameGreedyII {

    public int jump(int[] nums) {

        int jumps = 0, curEnd = 0, maxReachableIndex = 0;

        for(int i = 0; i < nums.length - 1; i++){
            maxReachableIndex = Math.max(i + nums[i], maxReachableIndex);

            if(i == curEnd){
                jumps++;
                curEnd = maxReachableIndex;
            }
        }

        return jumps;
    }
}
