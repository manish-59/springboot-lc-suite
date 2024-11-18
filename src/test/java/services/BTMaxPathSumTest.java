package services;

import org.junit.jupiter.api.Test;

public class BTMaxPathSumTest {

    BTMaxPathSum bTMaxPathSum = new BTMaxPathSum();

    @Test
    public void testMaxPathSum(){

        System.out.println(bTMaxPathSum.maxPathSum(TreeBuilder.buildTree(new Integer[]{-10,9,20,null,null,15,7})));
    }
}
