package services;

import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {

    @Test
    public void testNumberOfIslands(){

        System.out.println(new NumberOfIslands().numIslands(new char[][]{{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}}));
    }
}
