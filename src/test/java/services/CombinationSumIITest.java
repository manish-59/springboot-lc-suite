package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CombinationSumIITest {

    CombinationSumII cs2 = new CombinationSumII();

    @Test
    public void testCombinationSum2(){

        for(List<Integer> i: cs2.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8)){
            System.out.println(i);
        }
    }
}
