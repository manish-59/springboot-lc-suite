package services;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    //216
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        comb(0, k, n, ans, nums, new ArrayList<>(), 0); // Start the backtracking
        return ans;
    }

    void comb(int sum, int k, int n, List<List<Integer>> ans, int[] nums, List<Integer> arr, int i) {
        if (sum > n || arr.size() > k) {
            return;
        }

        if (sum == n && arr.size() == k) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            arr.add(nums[j]);
            comb(sum + nums[j], k, n, ans, nums, arr, j + 1);
            arr.remove(arr.size() - 1);
        }
    }
}
