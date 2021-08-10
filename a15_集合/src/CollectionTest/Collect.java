package CollectionTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Collect {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        //add(Object e); 将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        //size();
        System.out.println(coll.size());//4

        //addAll();
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add("ABC");
        coll.addAll(coll1);

        System.out.println(coll.size());//6
        System.out.println(coll);

        //clear(); 清空集合元素
        coll.clear();

        //.isEmpty(); 判断集合是否为空
        System.out.println(coll.isEmpty());
    }
}
