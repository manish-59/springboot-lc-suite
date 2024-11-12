package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumIITest {

    TwoSumII twoSumII = new TwoSumII();

    @Test
    public void testTwoSum(){

        System.out.println(Arrays.toString(twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
