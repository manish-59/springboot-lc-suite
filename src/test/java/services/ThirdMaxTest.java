package services;

import org.junit.jupiter.api.Test;

public class ThirdMaxTest {

    @Test
    public void testThirdMax(){

        System.out.println(new ThirdMax().thirdMax(new int[]{2,2,3,1}));
        System.out.println(new ThirdMax().thirdMax(new int[]{3,2,1}));
        System.out.println(new ThirdMax().thirdMax(new int[]{1,2}));
    }
}
