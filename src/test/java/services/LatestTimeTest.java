package services;

import org.junit.jupiter.api.Test;

public class LatestTimeTest {

    @Test
    public void testLatestTime(){

        System.out.println(new LatestTime().findLatestTime("1?:?4"));
    }
}
