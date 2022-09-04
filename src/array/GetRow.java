package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fer
 * date 2022/9/4
 */

public class GetRow {

    /*
        杨辉三角 Ⅱ
        根据杨辉三角Ⅰ（Generate）直接获取最后一项
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        // i 表示 res 中第几项
        for (int i = 0; i <= rowIndex; i++) {
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
        return res.get(res.size()-1);
    }
}
