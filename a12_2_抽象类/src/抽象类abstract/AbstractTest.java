package 抽象类abstract;

/*
 *  abstract关键字的使用
 *  1.abstract：抽象的
 *  2.abstract可以用来修饰的结构：类、方法
 *  3.abstract修饰类：抽象类
 *      >此类不能实例化
 *      >抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 *      >开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 *  4.abstract修饰方法：抽象方法
 *      >抽象方法只有方法的声明，没有方法体
 *      >包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
 *      >若子类重写了父类中的所有的抽象方法后，此子类可实例化
 *      若子类没有重写父类中的所有抽象方法，则此子类也是一个抽象类，需要使用abstract修饰
 *  注意点：1.不能用来修饰：属性、构造器等结构 2.不能用来修饰私有方法、静态方法、final的方法
 */
public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person类抽象了，就不可实例化
//        Person p1 = new Person();//'Person' is abstract; cannot be instantiated
//        p1.eat();
    }
}

abstract class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //抽象方法
    public abstract void eat();


    public void walk(){
        System.out.println("人走路");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}

class Student extends Person {
    public Student(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {

    }
}