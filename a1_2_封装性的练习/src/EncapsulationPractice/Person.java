package EncapsulationPractice;

/*
 *  练习1.创建程序，在其中定义两个类：Person和PersonTest。定义如下：
 *  用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 *
 *  练习2.在Person类中添加构造器，利用构造器设置所有人的age属性初始化都为18.
 *  修改上题中类和构造器，增加name属性，使得每次创建Person对象的同时初始化对象的age属性值和n。
 */
public class Person {
    private int age;
    private String name;

    public Person(){
        age = 12; //构造方法对属性的初始化
    }

    public Person(String n,int a){
        name = n;
        age = a;

    }
    public void setAge(int a) {
        if (a < 0 || a > 130) {
            //throw new RuntimeException(""传入的数据非法！);
            System.out.println("传入的数据非法！");
            return;
        }
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
