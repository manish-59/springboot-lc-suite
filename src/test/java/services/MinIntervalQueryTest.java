package services;

import org.junit.jupiter.api.Test;

public class MinIntervalQueryTest {

    @Test
    public void testMinIntervalQuery(){

        int[] res = new MinIntervalQuery().minInterval(new int[][]{{1,4},{2,4},{3,6},{4,4}}, new int[]{2,3,4,5});
        for(int i:res){
            System.out.println(i);
        }
        res = new MinIntervalQuery().minInterval(new int[][]{{2,3},{2,5},{1,8},{20,25}}, new int[]{2,19,5,22});
        for(int i:res){
            System.out.println(i);
        }
    }
}
