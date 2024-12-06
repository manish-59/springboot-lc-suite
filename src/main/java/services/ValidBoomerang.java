package services;

public class ValidBoomerang {

    public boolean isBoomerang(int[][] points) {

        long s1 = slope(points[0], points[1]);
        long s2 = slope(points[1], points[2]);
        long s3 = slope(points[2], points[0]);


        return s1!=s2 && s2!=s3;
    }

    public long slope(int[] a, int[]b){

        if(b[0]-a[0] == 0)  return (long) b[1]-a[1];
        return (long) (b[1]-a[1])/(b[0]-a[0]);
    }
}
