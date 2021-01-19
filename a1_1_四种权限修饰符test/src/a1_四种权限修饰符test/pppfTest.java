package a1_四种权限修饰符test;

public class pppfTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 2;
        order.methodPublic();
        order.orderDefault = 1;
        //出了order类就无法调用
//        order.methodPrivate
    }

}
class Order{
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }
    void methodDefault(){
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }
    public void methodPublic() {
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }
}

