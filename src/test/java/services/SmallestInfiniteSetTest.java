package services;

import org.junit.jupiter.api.Test;

public class SmallestInfiniteSetTest {

    SmallestInfiniteSet sis = new SmallestInfiniteSet();

    @Test
    public void testSIS(){

        sis.addBack(2);
        System.out.println(sis.popSmallest());
        System.out.println(sis.popSmallest());
        System.out.println(sis.popSmallest());
        sis.addBack(1);
        System.out.println(sis.popSmallest());
        System.out.println(sis.popSmallest());
        System.out.println(sis.popSmallest());
    }


}
