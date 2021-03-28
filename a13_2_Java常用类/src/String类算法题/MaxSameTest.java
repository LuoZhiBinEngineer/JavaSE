package String类算法题;

import org.junit.Test;

import java.util.Arrays;

/*
 *  获取两个字符串中最大相同子串。比如：
 *  str1="abcwerthelloyuiodef";str2="cvhellobnm"
 *  提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 */
public class MaxSameTest {
    /*//前提：字符串中只有一个最大相同值
    public String getMaxSameSubString(String str1, String str2) {
        if (str1 != null && str2 != null){
            String maxStr = str1.length() >= str2.length() ? str1 : str2;
            String minStr = str1.length() < str2.length() ? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {
                for (int x = 0, y = length - i; y < length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        return subStr;
                    }
                }
            }
        }
        return null;
    }*/

    //情况：字符串中有多个相同串
    public String[] getMaxSameSubString1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() >= str2.length()) ? str1 : str2;
            String minString = (str1.length() < str2.length()) ? str1 : str2;
            int len = minString.length();

            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y <= len; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        sBuffer.append(subString + ",");
                    }
                }
//                System.out.println(sBuffer);
                if (sBuffer.length() != 0) {
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$", "").split("\\,");
            return split;
        }
        return null;
    }

    @Test
    public void test() {
        String str1 = "abcwerthello1yuiodefabcdef";
        String str2 = "cvhello1bnmabcdef";
        String[] maxSameSubStrings = getMaxSameSubString1(str1, str2);
        System.out.println(Arrays.toString(maxSameSubStrings));
    }
}
