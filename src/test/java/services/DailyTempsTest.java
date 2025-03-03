package services;

import org.junit.jupiter.api.Test;

public class DailyTempsTest {

    @Test
    public void tstDailyTemps(){

        for(int e: new DailyTemps().dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})){

            System.out.println(e);
        }
    }
}
