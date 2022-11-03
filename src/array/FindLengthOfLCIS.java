package array;

/**
 * @author Fer
 * date 2022/10/29
 */

public class FindLengthOfLCIS {
    /**
     * 最长连续递增序列
     */
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int len = nums.length;
        if (len == 1) {
            return max;
        }
        // l 为当前最长连续递增序列
        int l = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) {
                l += 1;
            } else {
                l = 1;
            }
            max = Math.max(max, l);
        }
        return max;
    }
}
