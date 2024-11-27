package services;

import org.junit.jupiter.api.Test;

public class MergeTripletsGreedyTest {

    @Test
    public void testMergeTripletsGreedy(){

        System.out.println(new MergeTripletsGreedy().mergeTriplets(new int[][]{{2,5,3},{1,8,4},{1,7,5}}, new int[]{2,7,5}));
        System.out.println(new MergeTripletsGreedy().mergeTriplets(new int[][]{{3,4,5},{4,5,6}}, new int[]{3,2,5}));
        System.out.println(new MergeTripletsGreedy().mergeTriplets(new int[][]{{2,5,3},{2,3,4},{1,2,5},{5,2,3}}, new int[]{5,5,5}));
    }
}
