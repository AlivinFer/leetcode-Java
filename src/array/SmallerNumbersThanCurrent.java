package array;

/**
 * @author Fer
 * date 2022/11/1
 */

public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        // 有多少小于当前数字的数字
        // [8, 1, 2, 2, 3]
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = 0;
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    res[i] += 1;
                }
                if (nums[i] < nums[j]){
                    res[j] += 1;
                }
            }
        }
        return res;
    }
}
