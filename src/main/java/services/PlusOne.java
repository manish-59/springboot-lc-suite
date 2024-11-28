package services;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int num = returnNum(digits);

        return returnArray(num+1);
    }

    private int returnNum(int[] digits){

        int res = 0;
        for(int i=0; i<digits.length-1;i++){
            res = (res+digits[i])*10;
        }
        return res + digits[digits.length-1];
    }

    private int[] returnArray(int num){

        List<Integer> res = new ArrayList<>();
        while(num>0){
            res.add(num%10);
            num = num/10;
        }

        res = res.reversed();
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
