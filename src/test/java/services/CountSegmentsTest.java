package services;

import org.junit.jupiter.api.Test;

public class CountSegmentsTest {

    @Test
    public void testCountSegments(){

        System.out.println(new CountSegments().countSegments("Hello, my name is John"));
        System.out.println(new CountSegments().countSegments("Hello"));
    }
}
