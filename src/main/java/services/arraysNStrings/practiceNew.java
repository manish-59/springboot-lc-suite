package services.arraysNStrings;

import java.util.HashMap;

public class practiceNew {

    public static int findUnique(int[] nums){

        HashMap<Integer, Boolean> hshs = new HashMap<>();
        for(Integer e: nums){

            if(!hshs.containsKey(e)){
                hshs.put(e, true);
            }else{
                hshs.put(e, false);
            }
        }

        for(Integer e: hshs.keySet()){
            if(hshs.get(e)) return e;
        }

        return -1;

    }

    public static void main(String[] args){

        System.out.println(findUnique(new int[]{4,1,2,1,2}));
        System.out.println(findUnique(new int[]{2,2,3,2}));
    }
}
