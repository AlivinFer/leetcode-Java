package array;

import java.util.PriorityQueue;

/**
 * @author Fer
 * date 2022/11/5
 */

public class LastStoneWeight {

    public static void main(String[] args) {
        LastStoneWeight test = new LastStoneWeight();
        System.out.println(test.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    /**
     * 最后一块石头的重量
     * [2,7,4,1,8,1]
     */
    public int lastStoneWeight(int[] stones) {
        // PriorityQueue（优先队列） 通过二叉小顶堆实现，作用是能保证每次取出的元素都是队列中权值最小的
        // 通过构造时传入比较器，转换成大顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            // 获取并删除队首元素
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
