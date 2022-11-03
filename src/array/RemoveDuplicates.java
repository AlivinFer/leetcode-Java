package array;

/**
 * @author Fer
 * date 2022/8/23
 */

public class RemoveDuplicates {

    /**
     *   升序数组，在原数组的基础上使得前k个元素不重复，并返回k
     *   思想：双指针（快慢指针）
     */
    // [0,0,0,1,1,2,2,3,3,4,4,4]
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
