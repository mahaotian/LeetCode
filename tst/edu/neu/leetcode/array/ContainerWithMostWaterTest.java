package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {
    private static final int[] TEST_INPUT = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    @Test
    public void maxAreaTest() {
        Assert.assertEquals(ContainerWithMostWater.maxArea(TEST_INPUT), 49);
    }
}
