package services;

import org.junit.jupiter.api.Test;

public class InOrderTraverseBTTest {

    @Test
    public void testInOrderTraverseBT(){

        for(Integer e: new InOrderTraverseBT().inorderTraversal(TreeBuilder.buildTree(new Integer[]{1,2,3,4,5,null,8,null,null,6,7,9}))){
            System.out.print(e + "-");
        }
    }
}
