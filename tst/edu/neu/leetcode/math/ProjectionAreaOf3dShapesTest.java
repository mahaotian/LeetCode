package edu.neu.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

public class ProjectionAreaOf3dShapesTest {
    private static final int[][] GRID_1 = {{2}};
    private static final int[][] GRID_2 = {{1, 2}, {3, 4}};
    private static final int[][] GRID_3 = {{1, 0}, {0, 2}};
    private static final int[][] GRID_4 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    private static final int[][] GRID_5 = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};

    @Test
    public void projectionAreaTest() {
        Assert.assertEquals(ProjectionAreaOf3dShapes.projectionArea(GRID_1), 5);
        Assert.assertEquals(ProjectionAreaOf3dShapes.projectionArea(GRID_2), 17);
        Assert.assertEquals(ProjectionAreaOf3dShapes.projectionArea(GRID_3), 8);
        Assert.assertEquals(ProjectionAreaOf3dShapes.projectionArea(GRID_4), 14);
        Assert.assertEquals(ProjectionAreaOf3dShapes.projectionArea(GRID_5), 21);
    }
}
