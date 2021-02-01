package super关键字;

import javax.swing.plaf.synth.SynthTableUI;

public class Student extends Person {
    String major;
    int id = 1002;

    public Student() {
        super();
        System.out.println("我无处不在");//测试里面默认有super();
    }

    public Student(String major) {
        super();
        this.major = major;
    }

    public Student(String name, int age, String major) {
//        this.name = name;
//        this.age = age;
        super(name, age);//调用父类的构造器
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

    public void study() {
        System.out.println("学生学习知识");
        eat();
        super.eat();
    }

    public void show() {
        System.out.println("name: " + name + "，age: " + age);
        System.out.println("Student id = " + this.id);//通常情况下省略this
        System.out.println("Father id = " + super.id);//super调用了父类的属性
    }
}
