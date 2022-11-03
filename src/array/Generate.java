package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fer
 * date 2022/9/2
 */

public class Generate {

    /**
     * 杨辉三角
     * 利用每一项都是左右对称的特点
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        // i 表示 res 中第几项
        for (int i = 0; i < numRows; i++) {
            List<Integer> item = new ArrayList<>();
            // j 表示每一项中的元素位置
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    item.add(1);
                } else {
                    item.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(item);
        }
        return res;
    }
}
