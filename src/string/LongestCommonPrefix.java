package string;

/**
 * @author Fer
 * date 2023/7/16
 *
 * 最长公共前缀
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"dac", "acbcsadf", "aceewcc"};
        String[] strs1 = {"flow", "flower", "flight"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs1));
    }

    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0){
                break;
            }
        }
        return prefix;
    }

    /**
     * 横向比较
     * @param str1 前一个字符串
     * @param str2 后一个字符串
     * @return 返回两字符公共部分
     */
    public String longestCommonPrefix(String str1, String str2){
        int minStr = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < minStr && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return str1.substring(0, index);
    }

    /**
     * 横向比较
     * @param strs  字符串数组
     * @return 最长公共前缀
     */
   public String longestCommonPrefixByCol(String[] strs){
        if (strs == null || strs.length == 0){
            return "";
        }
        int firstLen = strs[0].length();
        for (int i = 0; i < firstLen; i++) {
           char c = strs[0].charAt(i);
           for (int j = 1; j < strs.length; j++) {
               if (i == strs[j].length() || c != strs[j].charAt(i)){
                   return strs[0].substring(0, i);
               }
           }
       }
       return strs[0];
   }

}
