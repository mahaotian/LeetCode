package edu.neu.leetcode.math;

public class ProjectionAreaOf3dShapes {
    public static int projectionArea(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            int maxRow = grid[i][0];
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0)
                    res++;
                if (grid[i][j] > maxRow)
                    maxRow = grid[i][j];
            }
            res += maxRow;
        }
        for (int j = 0; j < grid[0].length; j++) {
            int maxColumn = grid[0][j];
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] > maxColumn)
                    maxColumn = grid[i][j];
            }
            res += maxColumn;
        }
        return res;
    }
}
