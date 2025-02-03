package services;

import org.junit.jupiter.api.Test;

public class SuccessfulPairsSpellsPotionsTest {

    @Test
    public void testSuccessfulPairsSpellsPotions(){

        SuccessfulPairsSpellsPotions spsp = new SuccessfulPairsSpellsPotions();
        int[] res = spsp.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7);
        for(int i:res){
            System.out.println(i);
        }
    }
}
