package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ReshapeTheMatrixTest {
    private static final ReshapeTheMatrix RESHAPE_THE_MATRIX = new ReshapeTheMatrix();
    private static final int[][] NUMS = {{1, 2}, {3, 4}};
    private static final int[][] RES = {{1, 2, 3, 4}};

    @Test
    public void matrixReshapeTest() {
        int[][] res = RESHAPE_THE_MATRIX.matrixReshape(NUMS, 1, 4);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                Assert.assertEquals(res[i][j], RES[i][j]);
            }
        }
    }

    @Test
    public void matrixReshapeTestExcpetion() {
        int[][] res = RESHAPE_THE_MATRIX.matrixReshape(NUMS, 2, 4);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                Assert.assertEquals(res[i][j], NUMS[i][j]);
            }
        }
    }
}
