package services;

import models.TreeNode;
import org.junit.jupiter.api.Test;

public class CountGoodNodesBTTest {

    @Test
    public void testGoodNodes(){

        TreeNode tn = TreeBuilder.buildTree(new Integer[]{3,1,4,3,null,1,5});
        System.out.println(CountGoodNodesBT.goodNodes(tn));
    }
}
