package 继承权限的包;

import a1_四种权限修饰符test.Order;

public class SubOrder extends Order {
    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法。
//        orderPrivate = 1;
//        orderDefault = 2;
//        orderDefault();
//        orderPrivate();
    }
}
