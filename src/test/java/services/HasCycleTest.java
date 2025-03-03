package services;

import org.junit.jupiter.api.Test;

import static services.LinkedListUtils.createLinkedList;

public class HasCycleTest {

    @Test
    public void testHasCycle(){

        System.out.println(new HasCycle().hasCycle(createLinkedList(new int[]{3,2,0,-4})));
    }
}
