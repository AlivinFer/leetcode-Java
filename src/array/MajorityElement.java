package array;

import java.util.HashMap;

/**
 * @author Fer
 * date 2022/10/23
 */

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int len = nums.length / 2;
        System.out.println(len);
        MajorityElement s = new MajorityElement();
        int res = s.majorityElement(nums);
        System.out.println(res);
    }

    /*
        找寻数组中的多数元素
        [2,2,1,1,1,2,2]
     */
    public int majorityElement(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                if (map.get(num) > len / 2) {
                    return num;
                }
            } else {
                map.put(num, 1);
            }
        }
        return 0;
    }
}
