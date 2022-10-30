package array;

/**
 * @author Fer
 * date 2022/10/30
 */

public class SortArrayByParity {

    // 按奇偶排序数组，偶数在前，奇数在后
    public int[] sortArrayByParity(int[] nums) {
        // 双指针移动交换，一次遍历完成
        // [3, 1, 2, 4]
        int l = 0, r = nums.length-1;
        while (l <= r) {
            if (nums[l] % 2 == 0) {
                l++;
                continue;
            }
            if (nums[r] % 2 != 0) {
                r--;
                continue;
            }
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        return nums;
    }
}
