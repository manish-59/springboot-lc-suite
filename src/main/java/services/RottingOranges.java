package services;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    static class Triplet {
        int row;
        int coll;
        int tmm;
        Triplet(int i, int j, int t) {
            this.row = i;
            this.coll = j;
            this.tmm = t;
        }
    }

    public int orangesRotting(int[][] grid) {
        Queue<Triplet> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int countF=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j]== 2) {
                    q.add(new Triplet(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }

                if (grid[i][j] == 1) {
                    countF++;
                }
            }
        }
        int tm =0;
        int[] rowe = {-1, 0, 1, 0};
        int[] cole = {0, 1, 0, -1};
        int cnt =0;
        while (!q.isEmpty()) {
            int row = q.peek().row;
            int col = q.peek().coll;
            int time = q.peek().tmm;
            q.remove();
            tm = time;
            for (int i=0; i<4; i++) {
                int r = row + rowe[i];
                int c = col + cole[i];
                if (r<n && r>-1 && c<m && c>-1 && grid[r][c] == 1 && vis[r][c] != 2) {
                    q.add(new Triplet(r, c, time+1));
                    vis[r][c] = 2;
                    cnt++;
                }
            }
        }
        if (countF != cnt) return -1;
        else return tm;
    }
}
