package string;

import java.util.Arrays;

/**
 * @author Fer
 * date 2023/7/17
 *
 * 最后一个单词长度
 */

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = " fly me   to    the moon  ";
        System.out.println(new LengthOfLastWord().lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String str) {
        // 会自动去掉后面的空行
        String[] strs = str.split(" ");
        System.out.println(strs.length);
        System.out.println(Arrays.toString(strs));
        // 匹配一行或多行空格
        String[] strs1 = str.split("\\s+");
        System.out.println(strs1.length);
        System.out.println(Arrays.toString(strs1));
        return strs[strs.length - 1].length();
    }
}
