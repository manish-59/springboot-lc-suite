package services;

import java.util.HashMap;

public class SingleNum {

    //136

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> track = new HashMap<>();
        for(int e:nums){
            if(track.containsKey(e)) track.replace(e, track.get(e)+1);
            else track.put(e,1);
        }
        for(int e: track.keySet()){
            if(track.get(e)==1) return e;
        }
        return 0;
    }
}
