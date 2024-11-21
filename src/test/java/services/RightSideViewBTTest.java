package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RightSideViewBTTest {

    @Test
    public void testRightSideViewBT(){

        List<Integer> res = new RightSideViewBT().rightSideView(TreeBuilder.buildTree(new Integer[]{1,2,3,null,5,null,4}));
        for(Integer e: res){
            System.out.println(e + " ");
        }
    }
}
