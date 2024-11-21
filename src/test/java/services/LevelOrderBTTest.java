package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LevelOrderBTTest {

    @Test
    public void testLevelOrderBT(){

        List<List<Integer>> res = new LevelOrderBT().levelOrder(TreeBuilder.buildTree(new Integer[]{3,9,20,null,null,15,7}));

        for(List<Integer> lsRes : res){
            for(Integer e: lsRes){
                System.out.print(e + " ");
            }
            System.out.println();
        }}
}
