# LeetCode-Java刷题

```先按照题型进行刷题，每种题型20道左右，每周进行复盘总结，在对各种题型熟悉后，再刷TOP100```

- 数组（Array）

- 字符串（String）

  知识点

  - split 方法

    ```java
    String s = " fly me   to    the moon  ";
     // 会自动去掉后面的空行
    String[] strs = str.split(" ");
    // 11
    System.out.println(strs.length);
    // [, fly, me, , , to, , , , the, moon]
    System.out.println(Arrays.toString(strs));
    // 匹配一行或多行空格
    String[] strs1 = str.split("[\\s]+");
    // 6
    System.out.println(strs.length);
    // [, fly, me, to, the, moon]
    System.out.println(Arrays.toString(strs));
    ```

    split 方法只会处理尾部的空字符串，不处理中间的空字符串和开头的空字符串

    **split(String regex, int limit)**

    返回指定长度的数组

  - 

- 排序（Sort）

- 栈（Stack）

- 堆（Heap）

- 二叉树（BinaryTree）

- 哈希表（HashTable）

- 动态规划（Dynamic）

- 深度优先和广度优先（DFSandBFS）

- 贪心（Greedy）
