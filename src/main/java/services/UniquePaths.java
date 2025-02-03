package services;

public class UniquePaths {

    //62

    public int uniquePaths(int m, int n) {
        int[] column = new int[n]; // Array to store the number of ways for each column in the current row - defaults to 0
        column[0] = 1; // Base case: Only one way to move down along the first column

        for (int i = 0; i < m; i++) { // Iterate through rows
            for (int j = 0; j < n; j++) { // Iterate through columns
                if (j > 0) { // Skip the first column (no left neighbor)
                    column[j] += column[j - 1]; // Add the value from the left column
                }
            }
        }
        return column[n - 1]; // The result is in the last column of the last row
    }
}
