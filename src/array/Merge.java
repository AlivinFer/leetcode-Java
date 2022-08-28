package array;

/**
 * @author Fer
 * date 2022/8/28
 */

public class Merge {
    /*
        合并两个有序数组
        双指针，利用两个数组是有序的
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int first = 0, second = 0;
        int cur;
        while (first < m || second < n) {
            if (first == m) {
                cur = nums2[second++];
            } else if (second == n) {
                cur = nums1[first++];
            } else if (nums1[first] < nums2[second]) {
                cur = nums1[first++];
            } else {
                cur = nums2[second++];
            }
            res[first + second -1] = cur;
        }
        if (m + n >= 0) System.arraycopy(res, 0, nums1, 0, m + n);
    }
}
