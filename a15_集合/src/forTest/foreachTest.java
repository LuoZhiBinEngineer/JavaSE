package forTest;

import CollectionTest.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class foreachTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(new Person("Jerry",20));
        coll.add(false);

        //for(集合元素的类型 局部变量 : 集合对象){}
        //内部仍然调用了迭代器
        for(Object obj : coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};

        //for(数组元素的类型 局部变量 : 数组对象){}
        for(int i : arr){
            System.out.println(i);
        }
    }

    //练习题
    @Test
    public void test3(){
        String[] arr = new String[]{"MM","MM","MM"};

        //普通for循环赋值
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "GG";
//        }

        //增强for循环赋值
        //赋值赋的是s，不是arr[i]
        for(String s : arr){
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
