package Date类;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Date;

/*
*java.util.Date类（子类：java.sql.Date类）
1.两个构造器的使用
 - 构造器一：创建一个对应当前时间的date对象
 - 构造器二：创建指定毫秒数的date对象
2.两个方法的使用
 - toString()：显示当前的年、月、日、时、分、秒
 - getTime()：获取当前Date对象对应的毫秒数。（时间戳）
3.java.sql.Date对应着数据库中的日期类型的变量
 - 如何实例化
 - 如何将java.util.Date对象转换为java.sql.Date对象
*/
public class DateTest {
    @Test
    public void test() {
        //构造器一：创建一个对应当前时间的date对象
        Date date = new Date();
        System.out.println(date.toString());//Tue Mar 23 22:22:19 CST 2021
        System.out.println(date.getTime());//1616509446504

        //构造器二：创建指定毫秒数的date对象
        Date date1 = new Date(1616509446504L);
        System.out.println(date1);

        java.sql.Date date2 = new java.sql.Date(1465658451456L);
        System.out.println(date2);//2016-06-11

        //如何将java.util.Date对象转换为java.sql.Date对象
        //方法一：
//        Date date3 = new java.sql.Date(646665546469L);
//        java.sql.Date date4 = (java.sql.Date) date3;
        //方法二：
        Date date5 = new Date();
        java.sql.Date date6 = new java.sql.Date(date5.getTime());
    }
}
