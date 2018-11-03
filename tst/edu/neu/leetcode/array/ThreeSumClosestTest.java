package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumClosestTest {
    private final static int[] TEST_INPUT = {-1, 2, 1, -4};
    private static final int TEST_TARGET = 1;

    private final static int[] TEST_INPUT_2 = {-1, -1, 1, 1, 3};
    private static final int TEST_TARGET_2 = 1;

    @Test
    public void threeSumClosestTest() {
        Assert.assertEquals(2, ThreeSumClosest.threeSumClosest(TEST_INPUT, TEST_TARGET));
        Assert.assertEquals(1, ThreeSumClosest.threeSumClosest(TEST_INPUT_2, TEST_TARGET_2));
    }
}
