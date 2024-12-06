package services;

import org.junit.jupiter.api.Test;

public class ValidBoomerangTest {

    @Test
    public void testValidBoomerang(){

        System.out.println(new ValidBoomerang().isBoomerang(new int[][]{{1,1},{2,3},{3,2}}));
        System.out.println(new ValidBoomerang().isBoomerang(new int[][]{{1,1},{2,2},{3,3}}));
    }
}
