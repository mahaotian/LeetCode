package edu.neu.leetcode.array;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                if (area > res) res = area;
            }
        }
        return res;
    }
}
