package array;

/**
 * @author Fer
 * date 2022/10/27
 */

public class Search {

    /**
     * 二分查找
     */
    public int search(int[] nums, int target) {
        // 暴力循环
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 二分查找
    public int search1(int[] nums, int target) {
       int l = 0, r = nums.length - 1;
       while (l < r) {
           int mid = (l + r) / 2;
           if (nums[mid] == target) {
               return mid;
           } else if (nums[mid] < target) {
               l = mid + 1;
           } else {
               r = mid - 1;
           }
       }
       return -1;
    }
}
