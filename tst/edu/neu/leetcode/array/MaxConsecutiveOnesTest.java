package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {
    private static int[] TEST_INPUT = {1, 1, 0, 1, 1, 1};

    @Test
    public void findMaxConsecutiveOnesTest() {
        Assert.assertEquals(MaxConsecutiveOnes.findMaxConsecutiveOnes(TEST_INPUT), 3);
    }
}
