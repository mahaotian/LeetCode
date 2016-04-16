package edu.neu.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by haotianm on 4/16/16.
 */
public class MedianofTwoSortedArraysTest
{
    @Test
    public void findMedianSortedArraysTest(){
        int[] num1={};
        int[] num2={1};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double res = medianofTwoSortedArrays.findMedianSortedArrays(num1,num2);
        assertEquals(res,1.0,1.0E-10);
    }
}
