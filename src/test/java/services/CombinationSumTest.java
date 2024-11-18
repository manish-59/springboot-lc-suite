package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CombinationSumTest {

    CombinationSum cs = new CombinationSum();

    @Test
    public void testCombinationSum(){

        for(List<Integer> i: cs.combinationSum(new int[]{1,2,3,4}, 7)){
            System.out.println(i);
        }
    }
}
