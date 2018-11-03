package edu.neu.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class IslandPerimeterTest {
    private static final int[][] ISLAND = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
    };

    @Test
    public void islandPerimeterTest() {
        Assert.assertEquals(IslandPerimeter.islandPerimeter(ISLAND), 16);
    }
}
