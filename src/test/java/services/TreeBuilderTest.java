package services;

import org.junit.jupiter.api.Test;
import models.TreeNode;

public class TreeBuilderTest {


    @Test
    public void testBuildTree(){

        TreeNode tn = TreeBuilder.buildTree(new Integer[]{3,9,20,null,null,15,7});
        TreeBuilder.printTree(tn);
    }
}
