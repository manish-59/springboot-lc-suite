package services;

import org.junit.jupiter.api.Test;

public class ValidMountainTest {

    @Test
    public void testValidMountain(){

        System.out.println(new ValidMountain().validMountainArray(new int[]{0,2,3,4,5,2,1,0}));
        System.out.println(new ValidMountain().validMountainArray(new int[]{2,1}));
        System.out.println(new ValidMountain().validMountainArray(new int[]{3,5,5}));
        System.out.println(new ValidMountain().validMountainArray(new int[]{0,3,2,1}));;
        System.out.println(new ValidMountain().validMountainArray(new int[]{2,0,2}));
    }
}
