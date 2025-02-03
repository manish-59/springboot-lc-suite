package services;

public class q2605 {

    //2605

    public int minNumber(int[] nums1, int[] nums2) {
        boolean []seen1 = new boolean[10];
        boolean []seen2 = new boolean[10];
        int min1 = 10, min2 = 10;
        for(int n: nums1) seen1[n] = true;
        for(int n: nums2) seen2[n] = true;
        for(int i = 1; i <= 9; i++) {
            if(seen1[i] && seen2[i]) {
                return i;
            }
            min1 = Math.min(min1, seen1[i] ? i : Integer.MAX_VALUE);
            min2 = Math.min(min2, seen2[i] ? i : Integer.MAX_VALUE);
        }
        return Math.min(min1, min2) * 10 + Math.max(min1, min2);
    }
}
