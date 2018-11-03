package edu.neu.leetcode.array;

public class MaxAreaOfIsland {
    public static int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int area = areaOfIsland(grid, i, j);
                if (area > res)
                    res = area;
            }
        }
        return res;
    }

    private static int areaOfIsland(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] == 0)
            return 0;
        grid[x][y] = 0;
        return areaOfIsland(grid, x - 1, y) +
                areaOfIsland(grid, x + 1, y) +
                areaOfIsland(grid, x, y - 1) +
                areaOfIsland(grid, x, y + 1) + 1;
    }
}
