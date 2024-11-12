package services;

import org.junit.jupiter.api.Test;

public class FindMaxAreaTest {

    FindMaxArea findMaxArea = new FindMaxArea();

    @Test
    public void testMaxArea(){

        System.out.println(findMaxArea.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
