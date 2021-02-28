package JUnit单元测试;

import org.junit.Test;

import java.util.Date;

/*
 *  Java中的JUnit单元测试
 *  1.选中当前工程-右键选择build path-然后选择add libraries-JUnit4-下一步
 *  2.创建Java类，进行单元测试。此时的Java类要求：①此类是public的②此类提供公共的无参构造器
 *  3.此类中声明单元测试方法。此时的单元测试方法：方法权限是public，没有返回值，没有形参
 *  4.此单元测试方法上需要声明注解：@Test，并在单元测试类中导入：import org.junit.Test;
 *  5.声明好单元测试方法以后，就可以在方法体内测试相关的代码。
 *  6.写完代码后，左键双击单元测试方法名，右键：run as - JUnit Test
 *  7.每个单元测试可以独立执行，互不干扰。
 * 说明：1.如果执行结果没有异常，JUnit显示绿色；异常则为红色。
 */
public class JUnitTest {
    int num = 20;

    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));

        //ClassCastException异常
//        Object obj = new String("GG");
//        Date date = (Date) obj;

        System.out.println(num);
        show();
    }

    public void show(){
        System.out.println("show()......");
    }

    @Test
    public void testToString(){
        String s2 = "MM";
        System.out.println(s2.toString());
    }
}
