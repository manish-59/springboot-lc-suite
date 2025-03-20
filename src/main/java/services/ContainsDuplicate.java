package services;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for(Integer e:nums){

            if(numSet.contains(e)) return true;
            else numSet.add(e);
        }

        return false;
    }
}
