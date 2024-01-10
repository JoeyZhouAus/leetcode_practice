package org.leetcode_practice;

public class MergeAlgorithm {

    //Solution 1
    //this function takes in two arrays and merges them into one array
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

            for (int i = 0; i < m+n; i++) {

                int mPointer = nums1[i];

                for (int j = 0; j < n; j++) {
                    int nPointer = nums2[j];

                    if(mPointer == 0 && nPointer != 0) {
                        nums1[i] = nPointer;
                        nums2[j] = 0;
                        break;
                    }
                    else if (nPointer != 0 && mPointer > nPointer) {
                        nums1[i] = nPointer;
                        nums2[j] = mPointer;
                    }
                }
            }
        return nums1;

    }
}