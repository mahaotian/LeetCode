package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ToeplitzMatrixTest {
    private static final int[][] TOEPLITZ_MATRIX = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {9, 5, 1, 2}};
    private static final int[][] NOT_TOEPLITZ_MATRIX = {
            {41, 45},
            {81, 41},
            {73, 81},
            {47, 73},
            {0, 47},
            {79, 76}};

    @Test
    public void isToeplitzMatrixTest() {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        Assert.assertTrue(toeplitzMatrix.isToeplitzMatrix(TOEPLITZ_MATRIX));
    }

    @Test
    public void isNotToeplitzMatrixTest() {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        Assert.assertFalse(toeplitzMatrix.isToeplitzMatrix(NOT_TOEPLITZ_MATRIX));
    }
}
