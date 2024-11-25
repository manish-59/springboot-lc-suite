package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    //40

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        bckTrk(candidates, target, new ArrayList<>(), res, 0);

        return res;
    }

    private void bckTrk(int[] candidates, int target, List<Integer> temp, List<List<Integer>> res, int idx){

        if(target ==0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i =idx; i<candidates.length;i++)
        {
            if(i>idx && candidates[i] == candidates[i-1])
            {
                continue;
            }
            if(candidates[i]<=target)
            {
                temp.add(candidates[i]);
                bckTrk(candidates,(target - candidates[i]), temp,res, i+1);
                temp.removeLast();

            }
        }
    }
}
