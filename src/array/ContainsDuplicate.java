package array;

import java.util.HashSet;

/**
 * @author Fer
 * date 2022/9/4
 */

public class ContainsDuplicate {

    /*
        存在重复元素
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
