package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MedianSlidingWindowTest {

    @Test
    public void testMedianSlidingWindow(){

        MedianSlidingWindow msw = new MedianSlidingWindow();

        System.out.println(Arrays.toString(msw.medianSlidingWindow(new int[]{2147483647,2147483647}, 2)));

    }
}
