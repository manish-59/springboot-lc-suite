package services;

import org.junit.jupiter.api.Test;

public class ValidateBSTTest {

    @Test
    public void testValidateBST(){

        System.out.println(new ValidateBST().isValidBST(TreeBuilder.buildTree(new Integer[]{5,1,4,null,null,3,6})));
    }
}
