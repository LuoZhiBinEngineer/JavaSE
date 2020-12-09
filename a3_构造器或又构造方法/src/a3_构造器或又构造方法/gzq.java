package a3_构造器或又构造方法;

/*
*  类的结构之三：构造器（或构造方法、constructor）
*  一、构造器的作用：
*   1.创建对象（对象调用类里的方法）
*   2.初始化对象的信息（xx p = new xx("xxx")）
*  二、说明：
*   1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参数的构造器
*   2.定义构造器的格式：权限修饰符 类名（形参列表）{}
*   3.一个类中定义的多个构造器，彼此构成重载
*   4.一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
*   5.构造器的权限和类的权限是相同的
 */

public class gzq {
    public static void main(String[] args) {
        //创建类的对象
        Person p = new Person();
        //对象调用类里的方法
        p.eat();

        Person p1 = new Person("Tom");
        System.out.println(p1.name);
    }

   static class  Person{
        String name;
        int age;

        //无参构造器
         public Person() {
             System.out.println("你看是不是调用了这个构造器呢！");
        }

        //构造器重载(或override)
       public Person(String n) {
             name = n;
       }

        public void eat() {
            System.out.println("人吃饭");
        }
    }
}

