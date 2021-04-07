package Comparable和Comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/*
 *  Comparator
 */
public class ComparatorTest {
    @Test
    public void test1() {
        String[] arr = new String[]{"MM", "GG", "KK","AA","CC","JJ","DD"};
        Arrays.sort(arr, new Comparator<String>() {
            //按照字符串从大到小的顺序排序
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
