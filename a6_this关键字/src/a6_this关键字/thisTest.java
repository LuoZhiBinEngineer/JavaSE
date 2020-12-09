package a6_this关键字;
/*
*   this关键字的使用：
*   1.this可以用来修饰、调用：属性、方法、构造器
*
*   2.this修饰属性和方法：{ this理解为：当前对象 }
*       2.1区分作用：在类的方法中，我们可以使用“this.属性”或“this.方法”的方式，调用当前对象属性或方法。
*       但是，通常情况下，我们选择省略“this”。特殊情况下，如果方法的形参和类的属性同名时，
*       我们必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参。
*
*       2.2区分作用：在类的方法中，我们可以使用“this.属性”或“this.方法”的方式，调用当前对象属性或方法。
*       但是，通常情况下，我们选择省略“this”。特殊情况下，如果构造器的形参和类的属性同名时，
*       我们必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参。
*
*   3.this调用构造器：
*       ① 我们在类的构造器中，可以是显式的使用“this（形参列表）”方式，调用指定的类的其他构造器
*       ② 构造器中不能通过“this（形参列表）”方式调用自己
*       ③ 如果一个 类中有n个构造器，则最多有n-1构造器使用了“this（形参列表）”
*       ④ 规定：“this（形参列表）”必须声明在当前构造器的首行
*       ⑤ 构造器内部最多只能声明一个“this（形参列表）”，用来调用其他的构造器
*/

public class thisTest {
    public static void main(String[] args) {
        Person p1 = new Person();

//        p1.setAge(1);
//        System.out.println(p1.getAge());
//        p1.eat();
//        System.out.println();

        Person p2 = new Person("Tom",20);
        System.out.println(p2.getAge());
    }

    static class Person {

        private String name;
        private int age;

        public Person(){
            //不能自己调自己
//            this();
            this.eat();
            String info = "此处省略了几十行代码";
            System.out.println(info);
        }


        public void eat(){
            System.out.println("hhh");
            //隐藏了this. （this.say();）
            say();
        }
        public void say(){
            System.out.println("666");
        }


        public Person(String name){
            this(); //调用了构造方法
            this.name = name;
        }
        public Person(int age){
            this(); //调用了构造方法
            this.age = age;
        }
        public Person(String name,int age){
            this(age);
            this.name = name;
        }


        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
}
