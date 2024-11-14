package services;

import java.util.HashMap;

public class FindDuplicateNum {

    //287
    static {
        // Calling with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            findDuplicate(new int[]{0});
        }
    }
    public static int findDuplicate(int[] nums) {

        HashMap<Integer, Integer> hmNums = new HashMap<>();

        for(int i:nums){
            if(!hmNums.containsKey(i)) hmNums.put(i, 1);
            else hmNums.put(i, hmNums.get(i) +1);
        }

        int res = 0;

        for(int i:nums){
            if(hmNums.get(i)>1) res = i;
        }

        return res;
    }
}
