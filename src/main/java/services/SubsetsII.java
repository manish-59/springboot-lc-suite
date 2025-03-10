package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    //90

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList)); // Add the current subset to the result list
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.removeLast();
        }
    }
}
