package 面试题;

import org.junit.Test;

/*
 *  关于包装类的使用的面试题
 */
public class InterviewTest {
    @Test
    public void test() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);//1.0 自动类型提升为double
    }
    @Test
    public void test2(){
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);//1
    }
    @Test
    public void test3(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        //Integer内部定义了一个IntegerCache结构，IntegerCache中定义了Integer[],保存了从-128~127范围的整数。
        //如果我们使用自动装箱的方式，给Integer赋值的范围在-128~127范围内，可以直接使用数组中的元素，不用再去new了
        //目的：提高效率

        Integer m = 1;//相当于new了一个对象
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false
    }
}
