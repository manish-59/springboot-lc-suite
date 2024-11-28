package services;

import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    @Test
    public void testSymmetricTree(){

        System.out.print(new SymmetricTree().isSymmetric(TreeBuilder.buildTree(new Integer[]{1,2,2,3,4,4,3})));
    }
}
