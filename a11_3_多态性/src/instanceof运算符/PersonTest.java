package instanceof运算符;

import java.util.Date;

/*
 *  面向对象的特征之三：多态性（Polymorphism ）
 *  1.理解：可以理解为一个事物的多种形态
 *  2.何为多态性：
 *      对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 *  3.多态的使用：虚拟方法调用
 *      有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 *  总结：编译看左边，运行看右边
 *  4.多态性的使用前提：①类的继承关系；②方法的重写
 *  5.对象的多态性，只适用于方法，不适用于属性。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();
        //****************************
        System.out.println();
        //对象的多态性：父类的引用指向子类的对象
        Person p2 = new Man();
//        Person p3 = new Woman();
        //多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法---虚拟方法调用
        p2.eat();//调用了子类重写父类的方法
        p2.walk();

        //p2.earnMoney();

        System.out.println(p2.id);
        System.out.println("************************");
        //不能调用子类所特有的方法：编译时p2是Person类型
        //p2.earnMoney();
        //p2.isSmoking = ture;
        p2.name = "Tom";
/*  有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法，但是由于变量声明为父类类型，
    导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。
*/
        //如何才能调用子类特有的属性和方法？
        //向下转型：使用强制类型转换符
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;

        //使用强制转换时，肯出现ClassCastException的异常。
//        Woman w1 = (Woman) p2;
//        w1.goShopping();

        /*
         *  instanceof关键字的使用：
         *  a instanceof A: 判断对象a是否是类A的实例。如果是，返回ture，如果不是，返回false。
         *
         *  使用场景：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，
         *  先进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转向。
         *
         *  如果a instanceof A返回true，则a instanceof B也返回true，其中，类B是类A的父类。
         */

        if (p2 instanceof Woman){
            Woman w1 = (Woman)p2;
            w1.goShopping();
            System.out.println("*****Woman*****");
        }
        if (p2 instanceof Man){
            Man m2 = (Man)p2;
            m2.earnMoney();
        }

        //练习
        //问题一：编译时通过，运行时不通过
            //举例一：
//        Person p3 = new Woman();
//        Man m3 = (Man)p3;
            //举例二：
//        Person p4 = new Person();
//        Man m4 = (Man)p4;
        //问题二：编译时通过，运行时通过
        Object obj = new Woman();
        Person p = (Person)obj;
        //问题三：编译不通过
//        Man m5 = new Woman();
//        String str = new Date();
    }
}
