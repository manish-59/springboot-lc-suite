package services;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        boolean res = false;

        int m = matrix.length, n = matrix[0].length;

        int start =0, end = m*n-1;

        while(start<=end){

            int mid = start + (end-start)/2;
            int row = mid/n;
            int column = mid%n;

            if(matrix[row][column] == target)
                res = true;

            if(matrix[row][column] < target)
                start = mid+1;

            else
                end = mid -1;
        }
        return res;
    }
}
