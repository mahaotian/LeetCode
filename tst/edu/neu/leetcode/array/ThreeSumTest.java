package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {
    private static final int[] TEST_INPUT = {-1, 0, 1, 2, -1, -4};
    private static final List<List<Integer>> TEST_RESULT = Arrays.asList(
            Arrays.asList(-1, -1, 2),
            Arrays.asList(-1, 0, 1)
    );

    @Test
    public void threeSumTest() {
        List<List<Integer>> res = ThreeSum.threeSum(TEST_INPUT);
        for (int i = 0; i < res.size(); i++) {
            Assert.assertEquals(res.get(i), TEST_RESULT.get(i));
        }
    }
}
