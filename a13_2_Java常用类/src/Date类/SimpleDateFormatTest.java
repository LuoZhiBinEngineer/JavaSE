package Date类;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  JDK 8.0之前的日期时间的API测试
 *  1.System类中currentTimeMillis();
 *  2.java.util.Date和子类java.sql.Date
 *  3.SimpleDateFormat
 *  4.Calendar
 */
public class SimpleDateFormatTest {
    /*SimpleDateFormat的使用：对日期Date类的格式化和解析
    1.操作：①格式化：日期 --> 字符串 ②解析：格式化的逆过程，字符串 --> 日期
    2.SimpleDateFormat的实例化
    */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期 --> 字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);
        System.out.println("*************************");
        //解析：格式化的逆过程，字符串 --> 日期
        String str = "2021/03/28 下午12:15";
        Date parse = sdf.parse(str);
        System.out.println(parse);
        //自定义日期输出格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);
        //自定义格式的解析
        String str1 = "2022-9-15 12:00:00";
        Date parse1 = sdf1.parse(str1);
        System.out.println(parse1);
    }
}
