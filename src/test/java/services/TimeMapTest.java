package services;

import org.junit.jupiter.api.Test;

public class TimeMapTest {

    @Test
    public void testTimeMap(){

        TimeMap tm = new TimeMap();
        tm.set("love", "high", 10);
        tm.set("love", "low", 20);

        System.out.println(tm.get("love", 5));
        System.out.println(tm.get("love", 10));
        System.out.println(tm.get("love", 15));
        System.out.println(tm.get("love", 20));
        System.out.println(tm.get("love", 25));
    }
}
