package services;

import org.junit.jupiter.api.Test;

public class SingleNumTest {

    @Test
    public void testSingleNum(){

        System.out.print(new SingleNum().singleNumber(new int[]{4,1,2,1,2}));
        System.out.print(new SingleNum().singleNumber(new int[]{1}));
        System.out.print(new SingleNum().singleNumber(new int[]{2,2,1}));
    }
}
