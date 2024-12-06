package services;

import org.junit.jupiter.api.Test;

public class BuddyStringsTest {

    @Test
    public void testBuddyStrings(){

        System.out.println(new BuddyStrings().buddyStrings("ba","ab"));
        System.out.println(new BuddyStrings().buddyStrings("ab","ab"));
        System.out.println(new BuddyStrings().buddyStrings("aa","aa"));
    }
}
