package services;

import org.junit.jupiter.api.Test;

public class InsertIntervalTest {

    @Test
    public void testInsertInterval(){

        int[][] res = new InsertInterval().insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8});

        for(int[] i: res){
            for(int e:i){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
