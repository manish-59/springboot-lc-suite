package services;

import org.junit.jupiter.api.Test;

public class PreOrderTraverseBTTest {

    @Test
    public void testPreOrderTraverseBT(){

        for(Integer e: new PreOrderTraverseBT().preorderTraversal(TreeBuilder.buildTree(new Integer[]{1,null,2,3}))){
            System.out.print(e  + " ");
        }
        System.out.println();
        for(Integer e: new PreOrderTraverseBT().preorderTraversal(TreeBuilder.buildTree(new Integer[]{1,2,3,4,5,null,8,null,null,6,7,9}))){
            System.out.print(e  + " ");
        }
    }
}
