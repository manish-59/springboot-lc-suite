package services;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    //39

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        bckTrk(candidates, target, temp, res, 0);

        return res;
    }

    private void bckTrk(int[] candidates, int target, List<Integer> temp, List<List<Integer>> res, int idx){

        if(idx == candidates.length){
            if(target ==0) res.add(new ArrayList<>(temp));
            return;
        }

        if(candidates[idx] <= target){
            temp.add(candidates[idx]);
            bckTrk(candidates, target - candidates[idx], temp, res, idx);
            temp.removeLast();
        }
        bckTrk(candidates, target, temp, res, idx+1);

    }
}
