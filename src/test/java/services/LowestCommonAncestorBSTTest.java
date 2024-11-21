package services;

import org.junit.jupiter.api.Test;

public class LowestCommonAncestorBSTTest {

    @Test
    public void testLowestCommonAncestorBST(){

        TreeBuilder.printTree(new LowestCommonAncestorBST().lowestCommonAncestor(TreeBuilder.buildTree(new Integer[]{6,2,8,0,4,7,9,null,null,3,5}),
                TreeBuilder.buildTree(new Integer[]{2}), TreeBuilder.buildTree(new Integer[]{8})));
    }
}
