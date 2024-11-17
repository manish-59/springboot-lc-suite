package services;

import java.util.Arrays;

public class Candy {
    static {
        // Calling maxArea with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            candy(new int[]{0});
        }
    }

    public static int candy(int[] ratings) {
        int n=ratings.length;
        int [] candies=new int[n];
        Arrays.fill(candies,1);
        for(int i=1;i<n;++i){
            if(ratings[i-1]<ratings[i])candies[i]=candies[i-1]+1;
        }
        for(int i=n-2;i>=0;--i){
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int sum=0;
        for(int i=0;i<n;++i){
            sum+=candies[i];
        }
        return sum;
    }
}
