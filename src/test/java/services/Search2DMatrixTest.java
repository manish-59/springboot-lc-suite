package services;

import org.junit.jupiter.api.Test;

public class Search2DMatrixTest {

    @Test
    public void testSearch2DMatrix(){

        System.out.println(Search2DMatrix.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3));
    }
}
