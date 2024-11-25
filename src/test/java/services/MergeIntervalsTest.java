package services;

import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {

    @Test
    public void testMergeIntervals(){

        int[][] res = new MergeIntervals().merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});

        for(int[] i: res){
            for(int e:i){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
