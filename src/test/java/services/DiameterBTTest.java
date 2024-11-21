package services;

import org.junit.jupiter.api.Test;

public class DiameterBTTest {

    @Test
    public void testDiameterBT(){

        System.out.println(new DiameterBT().diameterOfBinaryTree(TreeBuilder.buildTree(new Integer[]{1,2,3,4,5})));
    }
}
