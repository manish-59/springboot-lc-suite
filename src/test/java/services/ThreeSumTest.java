package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ThreeSumTest {

    ThreeSum threeSum = new ThreeSum();

    @Test
    public void testThreeSum(){

        System.out.println(threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
