package string;

/**
 * @author Fer
 * date 2023/7/18
 *
 * 二进制求和
 */

public class AddBinary {

    public static void main(String[] args) {
        String a = "11";
        String b = "11";
        System.out.println(new AddBinary().addBinary(a, b));
        // java.lang.Integer
        System.out.println(getType('1' - '0'));
    }

    public String addBinary(String a, String b){
        StringBuilder ans = new StringBuilder();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            // 对于 byte、short、char型进行混合运算时，最终结果一定是整型
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

    public String addBinary1(String a, String b){
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
        );
    }

    public static String getType(Object obj) {
        return obj.getClass().getName();
    }

}
