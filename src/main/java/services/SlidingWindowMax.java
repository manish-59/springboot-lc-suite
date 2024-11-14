package services;

import java.util.Arrays;

public class SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k +1];

        for(int i=0; i< nums.length -k+1; i++){
            int[] subInt = Arrays.copyOfRange(nums, i, i+k);
            res[i] = subInt[0];
            for (int j = 1; j< subInt.length; j++) {
                if (subInt[j] > res[i]) {
                    res[i] = subInt[j];
                }
            }
        }

        return res;
    }
}
