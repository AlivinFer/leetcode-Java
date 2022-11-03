package array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Fer
 * date 2022/9/5
 */

public class ContainsNearbyDuplicate {

    /**
     *  存在重复元素Ⅱ
     *  数组内如果存在重复的元素，满足下标 abs(i-j) <= k
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
