package services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequency {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> kMost = new HashMap();
        int[] n = new int[k];

        for(int i:nums){
            if(!kMost.containsKey(i)){
                kMost.put(i, 1);
            }else{
                kMost.put(i, kMost.get(i) +1);
            }
        }


        for(int i=0; i<k; i++){
            n[i] = kMost.keySet().iterator().next();
            for(int j: kMost.keySet()){
                if(kMost.get(j)>=kMost.get(n[i])){
                    n[i] = j;
                }
            }
            kMost.put(n[i], 0);
        }

        return n;
    }
}
