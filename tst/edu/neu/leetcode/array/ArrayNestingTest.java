package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayNestingTest {
    private static final int[] TEST_INPUT = {5, 4, 0, 3, 1, 6, 2};

    @Test
    public void arrayNestingTest() {
        Assert.assertEquals(ArrayNesting.arrayNesting(TEST_INPUT), 4);
    }
}
