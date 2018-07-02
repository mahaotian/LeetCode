package edu.neu.leetcode.array;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int key = matrix[0][j];
            for (int i = 0; i < matrix.length && i + j < matrix[0].length; i++)
                if (matrix[i][j + i] != key)
                    return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            int key = matrix[i][0];
            for (int j = 0; i + j < matrix.length && j < matrix[i].length; j++) {
                if (matrix[i + j][j] != key)
                    return false;
            }
        }
        return true;
    }
}
