package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DailyTemperaturesTest {

    @Test
    public void testDailyTemperatures(){

        System.out.println(Arrays.toString(DailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
