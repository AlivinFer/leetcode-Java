package array;

/**
 * @author Fer
 * date 2022/8/16
 */

import java.util.HashMap;

public class TwoSum {

    /**
     * 暴力两层循环
     */
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 使用哈希表将寻找 target - nums[i] 的时间复杂度从o(n)降为o(1)，利用空间换时间
     */
    public int[] twoSumByHash(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
