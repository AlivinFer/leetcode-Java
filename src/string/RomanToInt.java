package string;


import java.util.Scanner;

/**
 * @author Fer
 * date 2023/2/20
 */

public class RomanToInt {

    /**
     *      字符          数值
     *      I             1
     *      V             5
     *      X             10
     *      L             50
     *      C             100
     *      D             500
     *      M             1000
     * @param s 字符串
     * @return  返回罗马数字
     */
    public int romanToInt(String s) {
        int res = 0;
        int preNum = switchRomanToInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = switchRomanToInt(s.charAt(i));
            if (preNum < num) {
                res -= preNum;
            } else {
                res += num;
            }
            preNum = num;
        }
        res += preNum;
        return res;
    }

    public int switchRomanToInt(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
