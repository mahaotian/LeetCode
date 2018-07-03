package edu.neu.leetcode.array;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c != nums.length * nums[0].length)
            return nums;
        int[][] res = new int[r][c];
        int m = 0, n = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = nums[m][n++];
                m += n / nums[0].length;
                n = n % nums[0].length;

            }
        }
        return res;
    }
}
