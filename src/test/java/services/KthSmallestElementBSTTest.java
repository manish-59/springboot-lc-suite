package services;

import org.junit.jupiter.api.Test;
import models.TreeNode;

public class KthSmallestElementBSTTest {

    @Test
    public void testKthSmallest(){

        TreeNode tn = TreeBuilder.buildTree(new Integer[]{4,2,5,null,3});
        System.out.println(KthSmallestElementBST.kthSmallest(tn, 1));
    }
}
