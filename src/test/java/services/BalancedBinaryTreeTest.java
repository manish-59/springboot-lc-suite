package services;

import org.junit.jupiter.api.Test;

public class BalancedBinaryTreeTest {

    @Test
    public void testIsBalanced(){

        TreeNode tn = TreeBuilder.buildTree(new Integer[]{3,9,20,null,null,15,7});
        System.out.println(BalancedBinaryTree.isBalanced(tn));
    }


}
