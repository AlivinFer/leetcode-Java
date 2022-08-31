package array;

/**
 * @author Fer
 * date 2022/8/31
 */

public class SearchInsert {

    /*
        搜索插入位置
        二分查找
     */
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
