package services;

import org.junit.jupiter.api.Test;
import java.util.List;

public class CombinationSumIIITest {

    @Test
    public void testCombinationSumIII(){

        List<List<Integer>> res = new CombinationSumIII().combinationSum3(3,7);

        for(List<Integer> li: res){
            for(Integer e: li){
                System.out.print(e);
            }
            System.out.println();
        }
    }
}
