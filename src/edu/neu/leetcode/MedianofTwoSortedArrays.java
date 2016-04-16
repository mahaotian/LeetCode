package edu.neu.leetcode;

import static java.lang.Math.min;

/**
 * Created by haotianm on 16-4-11.
 */
public class MedianofTwoSortedArrays
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int total = length1 + length2;
        if ((total) % 2 == 0)
            return (findKeySortedArrays(nums1, 0, nums1.length, nums2, 0, nums2.length, total / 2)
                    + findKeySortedArrays(nums1, 0, nums1.length, nums2, 0, nums2.length, total / 2 + 1)) / 2;
        else
            return findKeySortedArrays(nums1, 0, nums1.length, nums2, 0, nums2.length, total / 2 + 1);

    }

    private double findKeySortedArrays(int[] nums1, int m1, int length1, int[] nums2, int m2, int length2, int k)
    {
        if (length1 > length2)
            return findKeySortedArrays(nums2, m2, length2, nums1, m1, length1, k);
        if (length1 == 0)
        {
            return nums2[m2 + k - 1];
        }
        if (k == 1)
            return min(nums1[m1], nums2[m2]);
        int pa = min(length1, k / 2);
        int pb = k - pa;
        if (nums1[m1 + pa - 1] < nums2[m2 + pb - 1])
            return findKeySortedArrays(nums1, m1 + pa, length1 - pa, nums2, m2, length2, k - pa);
        else if (nums1[m1 + pa - 1] > nums2[m2 + pb - 1])
            return findKeySortedArrays(nums1, m1, length1, nums2, m2 + pb, length2 - pb, k - pb);
        else
            return nums1[m1 + pa - 1];
    }
}
