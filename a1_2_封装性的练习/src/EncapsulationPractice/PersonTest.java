package EncapsulationPractice;

/*
 *  在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，
 *  体会java的封装性。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

//        p1.age = 1; 没有权限设置

        //重新改写了属性的值，如果注释掉就会输出构造方法初始定义的值。
        p1.setAge(1);
        System.out.println("年龄为："+p1.getAge());

        Person p2 = new Person("Tom",21);
        System.out.println("name = "+p2.getName()+", age = "+p2.getAge());
    }
}
