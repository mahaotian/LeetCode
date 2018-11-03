package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class FirstMissingPositiveTest {
    private final static int[] TEST_INPUT_1 = {1, 2, 0};
    private final static int[] TEST_INPUT_2 = {3, 4, -1, 1};
    private final static int[] TEST_INPUT_3 = {7, 8, 9, 11, 12};

    @Test
    public void firstMissingPositiveTest() {
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(TEST_INPUT_1), 3);
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(TEST_INPUT_2), 2);
        Assert.assertEquals(FirstMissingPositive.firstMissingPositive(TEST_INPUT_3), 1);
    }
}
