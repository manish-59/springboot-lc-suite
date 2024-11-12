package services;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

//    Input: nums = [-1,0,1,2,-1,-4]
//    Output: [[-1,-1,2],[-1,0,1]]

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i: nums){

            hs.add(i);
        }

        List<Integer> uniqueEle = new ArrayList<>(hs);
//        for(int i=0; i< uniqueEle.size()-2;i++){
//
//            int j=i+1;
//            int k=i+2;
//
//            for(; j< uniqueEle.size()-1;){
//
//                if(uniqueEle.get(i) + uniqueEle.get(j) + uniqueEle.get(k) == 0){
//
//                }
//            }
//
//        }

        

        return res;
    }
    
}
