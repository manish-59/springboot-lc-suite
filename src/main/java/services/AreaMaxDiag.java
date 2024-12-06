package services;

public class AreaMaxDiag {

    //3000

    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = Integer.MIN_VALUE;
        int maxArea = Integer.MIN_VALUE;
        for (int[] dim: dimensions) {
            int l=dim[0],b=dim[1];
            int diag = l*l+b*b;
            if (diag>=maxDiag) {
                if (diag!=maxDiag || maxArea<=l*b)
                    maxArea = l*b;
                maxDiag = diag;
            }
        }
        return maxArea;
    }

}
