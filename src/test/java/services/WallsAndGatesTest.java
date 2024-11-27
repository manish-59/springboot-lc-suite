package services;

import org.junit.jupiter.api.Test;

public class WallsAndGatesTest {

    @Test
    public void testWallsAndGates(){

        new WallsAndGates().wallsAndGates(new int[][]{{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}});
    }
}
