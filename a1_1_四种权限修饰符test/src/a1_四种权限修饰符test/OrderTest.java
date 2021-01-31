package a1_四种权限修饰符test;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodPublic();
        order.methodProtected();
        //同一个包下，不能调用Order类外的隐私属性或方法
//        order.methodPrivate();
//        order.orderPrivate;
    }
}


