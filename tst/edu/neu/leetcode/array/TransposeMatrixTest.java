package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class TransposeMatrixTest {
    private static final int[][] TEST_INPUT_1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    private static final int[][] RES_1 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
    private static final int[][] TEST_INPUT_2 = {{1, 2, 3}, {4, 5, 6}};
    private static final int[][] RES_2 = {{1, 4}, {2, 5}, {3, 6}};

    @Test
    public void transposeTest() {
        Assert.assertArrayEquals(RES_1, TransposeMatrix.transpose(TEST_INPUT_1));
    }

    @Test
    public void transposeTest2() {
        Assert.assertArrayEquals(RES_2, TransposeMatrix.transpose(TEST_INPUT_2));
    }
}
