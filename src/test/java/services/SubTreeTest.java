package services;

import org.junit.jupiter.api.Test;
import models.TreeNode;

public class SubTreeTest {

    @Test
    public void testIsSubtree(){

        TreeNode tn = TreeBuilder.buildTree(new Integer[]{3,4,5,1,2,null,null,null,null,0});
        TreeNode subTn = TreeBuilder.buildTree(new Integer[]{4,1,2});

        System.out.println(SubTree.isSubtree(tn, subTn));
    }
}
