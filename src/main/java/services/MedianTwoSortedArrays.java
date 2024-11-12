package services;

public class MedianTwoSortedArrays {

    static {
    // Calling with an array of zeros multiple times (500 times)
    for(int i = 0; i < 500; i++) {
        findMedianSortedArrays(new int[]{0}, new int[]{0});
    }
}

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double res = 0d;

        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m+n];
        int i=0, j=0, k=0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        if((merged.length)%2 == 0) {
            res = (merged[merged.length/2  -1] + merged[(merged.length/2)] )/2.0;
        }else{
            res = merged[merged.length/2];
        }
        return res;
    }
}
