package array;

import java.util.Arrays;

/**
 * @author Fer
 * date 2022/10/24
 */

public class MissingNumber {

    /**
     * 丢失的数字
     */
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return len;
    }
}
