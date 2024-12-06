package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ThirdMax {

    //414
    public int thirdMax(int[] nums) {

        List<Integer> numL = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(Integer num :nums){
            hm.put(num,0);
        }

        for(Integer e: hm.keySet()){
            numL.add(e);
        }

        numL.sort(Collections.reverseOrder());
        if(numL.size()<3) return numL.get(0);
        return numL.get(2);
    }
}
