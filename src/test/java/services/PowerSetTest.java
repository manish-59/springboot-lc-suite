package services;

import org.junit.jupiter.api.Test;

public class PowerSetTest {

    PowerSet powerSet = new PowerSet();

    @Test
    public void testAllSubsets(){

        int[] nums = {1,2,3};
        powerSet.subsets(nums);
    }
}
