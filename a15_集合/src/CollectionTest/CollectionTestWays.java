package CollectionTest;

/*
 * Collection接口中声明的方法的测试
 * 注意：向Collection接口的实现类的对象中添加obj时，要求obj所在类重写equals()。
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTestWays {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(false);
        Person p = new Person("Jerry",20);
        coll.add(p);
        //1. contains(Object obj); 判断当前集合中是否包含obj
        //在判断时会去调用obj对象所在类的equals();
        boolean contains = coll.contains(123);
        System.out.println(contains);//true
        System.out.println(coll.contains(new String("TOM")));//true
//        System.out.println(coll.contains(p));//true
        System.out.println(coll.contains(new Person("Jerry",20)));//false
        //2. containsAll(Collection coll1); 判断形参coll1中的所有元素是否都存在于当前集合中。
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));//true
    }

    @Test
    public void test2(){
        //3. remove(Object obj); 从当前集合中移除obj元素。
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(new Person("Jerry",20));
        coll.add(false);
        coll.remove(1234);//也会调用equals()比对
        System.out.println(coll);

        //4. removeAll(Collection coll1); 差集：从当前集合中移除coll1中所有的元素
        Collection coll1 = Arrays.asList(123,4567);
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(new Person("Jerry",20));
        coll.add(false);
        //5. retainAll(Collection coll1); 交集：获取当前集合和coll1集合的交集，并返回给当前集合。
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //6. equals(Object obj);
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("TOM"));
        coll1.add(new Person("Jerry",20));
        coll1.add(false);

        System.out.println(coll.equals(coll1));
    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(new Person("Jerry",20));
        coll.add(false);
        //7. hashCode();
        System.out.println(coll.hashCode());

        //8. 集合 --> 数组 : toArray();
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //拓展： 数组 --> 集合：调用Arrays的静态方法asList();
        List<String> list = Arrays.asList("AA", "BB", "CC");
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1.size());//被识别为一个值，size为1
        //包装类对象时可识别为2个数
        List arr2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr2.size());//size为2

        //9. iterator(); 返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中测试
    }
}
