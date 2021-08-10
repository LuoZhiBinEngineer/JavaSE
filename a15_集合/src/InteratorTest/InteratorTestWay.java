package InteratorTest;

import CollectionTest.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 集合元素的遍历操作，使用Iterator接口
* 内部的方法： hasNext() 和 next()
* */
public class InteratorTestWay {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(new Person("Jerry",20));
        coll.add(false);

        Iterator iterator = coll.iterator();
        //方式一：
        //next() ①指针下移 ②将下移以后集合位置上的元素返回
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        //报异常：NoSuchElementException
//        System.out.println(iterator.next());

        //方式二：不推荐！！
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        /*方式三：推荐！！
            iterator.hasNext() 判断是否还有下一个元素
         */
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(new Person("Jerry",20));
        coll.add(false);

        //删除集合中的"TOM"元素
        /*
        如果还未调用next()或在上一次调用next方法之后已经调用了remove方法，再调用remove都会报IllegalStateException
         */
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj.equals("TOM")){
                iterator.remove();
            }
        }
        //重新遍历集合
        iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
