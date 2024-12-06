package services;

import org.junit.jupiter.api.Test;

public class AreaMaxDiagTest {

    @Test
    public void testAreaMaxDiag(){
        System.out.println(new AreaMaxDiag().areaOfMaxDiagonal(new int[][]{{9,3},{8,6}}));
    }
}
