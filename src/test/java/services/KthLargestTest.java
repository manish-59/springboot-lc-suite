package services;

import org.junit.jupiter.api.Test;

public class KthLargestTest {

    KthLargest kl = new KthLargest(3, new int[]{4, 5, 8, 2});

    @Test
    public void test(){

        System.out.println(kl.add(3));
        System.out.println(kl.add(5));
        System.out.println(kl.add(10));
        System.out.println(kl.add(9));
        System.out.println(kl.add(4));
    }
}
