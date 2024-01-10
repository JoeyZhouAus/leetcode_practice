package org.leetcode_practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LeetCodeTest {

    @Test
    void merge() {
        MergeAlgorithm mergeAlgorithm = new MergeAlgorithm();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int[] result = mergeAlgorithm.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(nums2));
    }



}