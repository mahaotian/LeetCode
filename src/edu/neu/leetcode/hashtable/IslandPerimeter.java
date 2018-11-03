package edu.neu.leetcode.hashtable;

public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0)
                    continue;
                int length = 0;
                if (i - 1 < 0 || grid[i - 1][j] == 0) length++;
                if (i + 1 >= grid.length || grid[i + 1][j] == 0) length++;
                if (j - 1 < 0 || grid[i][j - 1] == 0) length++;
                if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) length++;
                res += length;
            }
        }
        return res;
    }
}
