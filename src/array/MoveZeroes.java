package array;



/**
 * @author Fer
 * date 2022/10/25
 */

public class MoveZeroes {

    /*
        移动零
        nums = [0,1,0,3,12]
        [1,0,0,3,12]
        [1,3,0,0,12]
        [1,3,12,0,0]
     */

    public void moveZeroes1(int[] nums) {
        // 两次遍历，第一次遍历记录非0的个数
        // 第二次遍历，补0
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        for (int j = count; count < len; count++) {
            nums[count] = 0;
        }
    }

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index += 1;
            }
        }
    }


}
