package services;

import org.junit.jupiter.api.Test;

public class MaxDepthBTTest {

    @Test
    public void testMaxDepthBT(){

        System.out.println(new MaxDepthBT().maxDepth(TreeBuilder.buildTree(new Integer[]{3,9,20,null,null,15,7})));
    }
}
