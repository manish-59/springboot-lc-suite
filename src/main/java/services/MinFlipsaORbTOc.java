package services;

public class MinFlipsaORbTOc {

    //1318

    public int minFlips(int a, int b, int c) {
        int[] flipsRequired = new int[]{0,1,1,0,1,0,2,0};
        int totalFlips = 0;

        while(a>0 || b>0 || c>0) {

            int flipsRequiredIndex = ((a&1)<<2) | ((b&1)<<1) | (c&1);
            // if a bit is 1 b bit is 1 and c bit is 0
            // flipsRequiredIndex will be 110 -> 6
            // flipsRequired[flipsRequiredIndex] is 2

            totalFlips += flipsRequired[flipsRequiredIndex];

            a>>=1; b>>=1; c>>=1;
        }

        return totalFlips;
    }
}
