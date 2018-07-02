package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartitionITest {
    @Test
    public void arrayPairSumTest() {
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        int[] input = {1, 4, 3, 2};
        Assert.assertEquals(4, arrayPartitionI.arrayPairSum(input));
    }
}
