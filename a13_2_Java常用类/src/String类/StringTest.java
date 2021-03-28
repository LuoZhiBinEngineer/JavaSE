package String类;

import org.junit.Test;

public class StringTest {
    /*
    1.常量与常量拼接的结果在常量池。且常量池中不会存在相同内容的常量。
    2.只要其中有一个是变量，结果就在堆中。
    3.如果拼接的结果调用intern()方法，返回值就在常量池中。
     */

    @Test
    public void test4(){
        String s1 = "JavaEEHadoop";
        String s2 = "Hadoop";
        String s3 = s2 + "JavaEE";
        System.out.println(s1 == s3);//false

        final String s4 = "JavaEE";//final 定义在常量池
        String s5 = s4 + "Hadoop";
        System.out.println(s1 == s5);//true
    }

    @Test
    public void tests3(){
        String s1 = "JavaEE";
        String s2 = "Hadoop";
        String s3 = "JavaEEHadoop";
        String s4 = "JavaEE" + "Hadoop";
        String s5 = s1 + "Hadoop";
        String s6 = "JavaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s5 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8 = s5.intern();//返回值得到的s8使用的是常量池中已经存在的
        System.out.println(s3 == s8);//true
    }

    @Test
    public void test2(){
        //通过字面量定义的方式：此时的s1和s2的数据声明在方法区中的字符串常量池中
        String s1 = "JavaEE";
        String s2 = "JavaEE";
        //通过new+构造器的方式：此时的s3和s4保存的地址值，是数据在堆空间中开辟内存空间以后对应的地址值
        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println("*******************");
        Person p1 = new Person("Tom",20);
        Person p2 = new Person("Tom",20);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true
    }

/*
1.String类：代表字符串。Java程序中的所有字符串字面值（如“abc”）都作为此类的实例实现。
2.String是一个final类，代表不可变的字符序列，不可被继承。
3.字符串是常量，用双引号引起来表示。它们的值在创建之后不能更改。
4.String实现了Serializable接口：表示字符串是支持序列化的。实现Comparable接口：表示String可以比较大小。
5.String内部定义了final char[] value用于存储字符串数据。
6.String：代表不可变的字符序列。简称：不可变性。
体现： ①当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
②当对现有的字符串进行连接操作时（如+-），也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
③当调用String的replace()方法修改指定字符或字符串时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
7.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中。
8.字符串常量池中是不会存储相同内容的字符串的。
 */
    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("**************");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);

        System.out.println("**************");

        String s4 = "abc";
        String s5 = s4.replace("a","m");
        System.out.println(s4);
        System.out.println(s5);
  }
}
