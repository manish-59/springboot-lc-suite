package services;

import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    @Test
    public void testInvertBinaryTree(){

        InvertBinaryTree ibt = new InvertBinaryTree();
        TreeNode tn = TreeBuilder.buildTree(new Integer[]{4,2,7,1,3,6,9});
        TreeBuilder.printTree(ibt.invertTree(tn));
    }
}
