package services;

import org.junit.jupiter.api.Test;

public class SameTreeTest {

    @Test
    public void testSameTree(){

        System.out.println(new SameTree().isSameTree(TreeBuilder.buildTree(new Integer[]{1,2,3}), TreeBuilder.buildTree(new Integer[]{1,2,3})));
        System.out.println(new SameTree().isSameTree(TreeBuilder.buildTree(new Integer[]{1,2}), TreeBuilder.buildTree(new Integer[]{1,null,2})));
        System.out.println(new SameTree().isSameTree(TreeBuilder.buildTree(new Integer[]{1,2,1}), TreeBuilder.buildTree(new Integer[]{1,1,2})));
    }
}
