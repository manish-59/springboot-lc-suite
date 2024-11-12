package services;

import org.junit.jupiter.api.Test;

public class SubsetsIITest {

    @Test
    public void testSubsetsWithDup(){

        SubsetsII subsetsII = new SubsetsII();

        System.out.println(subsetsII.subsetsWithDup(new int[]{1,2,2}));
    }
}
