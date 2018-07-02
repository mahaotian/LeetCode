package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class FlippingAnImageTest {
    int[][] pic = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    int[][] res = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};

    @Test
    public void flippingAnImage() {
        FlippingAnImage FlippingAnImage = new FlippingAnImage();
        int[][] result = FlippingAnImage.flipAndInvertImage(pic);
        for (int i = 0; i < res.length; i++) {
            Assert.assertArrayEquals(result[i], res[i]);
        }
    }
}
