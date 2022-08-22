package array;

import java.util.*;

/**
 * @author Fer
 * date 2022/8/22
 */

public class ThreeSum {

    /*
        在给定数组中找出不重复的三个数，使得 a + b + c = 0
        思想：暴力解法，三次循环 + 去重（会超时）
        优化：先将数组排序，减少重复枚举的次数，对于每一重循环，相邻两次枚举的元素不能相同
            双指针（第二重和第三重循环并列）
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        int len = nums.length;
        if (len < 3) {
            return res;
        }
        for (int i = 0; i < len-2; i++) {
            for (int j = i+1; j < len-1; j++) {
                for (int k = j+1; k < len; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new LinkedList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if (!res.contains(list)) {
                            res.add(list);
                        }
                    }
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len < 3) {
            return res;
        }
        // 排序
        Arrays.sort(nums);
        // 从前往后枚举第一个元素
        for (int first = 0; first < len; first++) {
            if (first > 0 && nums[first] == nums[first-1]) {
                continue;
            }
            // c 从右往左遍历
            int third = len-1;
            int target = -nums[first];
            for (int second = first+1; second < len; second++) {
                if (second > first + 1 && nums[second-1] == nums[second]) {
                    continue;
                }
                // 保证 b 的指针在 c 的指针左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 当两个指针相遇了，终止循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    res.add(list);
                }
            }
        }
        return res;
    }
}
