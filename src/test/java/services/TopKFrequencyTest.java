package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TopKFrequencyTest {

    TopKFrequency topKFrequency = new TopKFrequency();

    @Test
    public void testTopKFrequent(){


        System.out.println(Arrays.toString(topKFrequency.topKFrequent(new int[]{1}, 1)));
    }
}
