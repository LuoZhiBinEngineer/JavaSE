package String类算法题;

import org.junit.Test;

//将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为“abfedcg”。
public class ReverseTest {
    @Test
    public void test() {
        String str = "abcdefg";
        String r = reverse(str, 2, 5);
        System.out.println(r);
    }

    //方式一：转换为char[]
    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null ) {
            char[] c = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = c[x];
                c[x] = c[y];
                c[y] = temp;
            }
            return new String(c);
        }
        return null;
    }
    //方式二：使用String拼接
    public String reverse1(String str, int startIndex, int endIndex) {
        if (str != null) {
            //第一部分
            String reverseStr = str.substring(0, startIndex);
            //第二部分
            for (int i = startIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            //第三部分
            reverseStr += str.substring(endIndex + 1);
            return reverseStr;
        }
        return null;
    }
}
