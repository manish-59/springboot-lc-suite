package services;

public class Sqrt {

    //69

    public int mySqrt(int x) {

        int i=0;
        long sq = i*i;
        while(x>=sq){
            i++;
            sq =i*i;
        }

        return i-1;
    }
}
