package Date类;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
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
    /*
     练习一：字符串“2021-05-20”转换为java.sql.Date
    */
    @Test
    public void testSQLTime() throws ParseException {
        String birthday = "2021-05-20";

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf2.parse(birthday);
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }
    /*
    Calendar日历类的使用
     */
    //1.实例化
    //方式一：创建其子类（GregorianCalendar）的对象
    //方式二：调用其静态方法getInstance()
    @Test
    public void testCalendar(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //常用操作
        //get()
        int daynow = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(daynow);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        daynow = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(daynow);
        //add()，减天数加负数
        calendar.add(Calendar.DAY_OF_MONTH,3);
        daynow = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(daynow);
        //getTime()：日历类 ---> Date类
        Date date = calendar.getTime();
        System.out.println(date);
        //setTime()：Date类 ---> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        daynow = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(daynow);
    }
    /*
    LocalDate、LocalTime、LocalDateTime（使用频率高）的使用
     */
    @Test
    public void testLocalTime(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println("******************");
        //设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDateTime localDate1 = LocalDateTime.of(2021,5,20,5,20);
        System.out.println(localDate1);

        int dayOfMonth = localDate1.getDayOfMonth();
        int dayOfYear = localDate1.getDayOfYear();
        DayOfWeek dayOfWeek = localDate1.getDayOfWeek();
        System.out.println(dayOfMonth);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);
        int monthValue = localDate1.getMonthValue();
        System.out.println(monthValue);
        //with设置相关的属性
        LocalDateTime localDateTime1 = localDate1.withDayOfMonth(11);
        System.out.println(localDateTime1);
    }
    /*
    Instant的使用：获取时间线（默认本初子午线）上的瞬时时间点。可能被用来记录应用程序中的事件时间戳
     */
    @Test
    public void testInstant(){
        //默认获取本初子午线的时区时间
        Instant instant = Instant.now();
        System.out.println(instant);
        //设置时间偏移量得到当前自己国家的时间
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        //toEpochMilli()：获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数--类似于Date类的getTime()
        long milli = instant.toEpochMilli();
        System.out.println(milli);
        //ofEpochMilli()：通过给定的毫秒数，获取Instant实例--类似Date(long millis)
        Instant ofEpochMilli = Instant.ofEpochMilli(1617199330291L);
        System.out.println(ofEpochMilli);
    }
}
