package services;

public class MaxAreaIslands {

    //695

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length, count =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count=Math.max(count,dfs(grid, i, j));
                }
            }
        }
        return count;
    }

    public int dfs(int[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        int count=1;
        count+=dfs(grid, i + 1, j);
        count+=dfs(grid, i - 1, j);
        count+=dfs(grid, i, j + 1);
        count+=dfs(grid, i, j - 1);
        return count;
    }
}
