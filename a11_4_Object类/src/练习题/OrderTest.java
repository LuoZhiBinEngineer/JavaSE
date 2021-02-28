package 练习题;

import java.util.Objects;

/*
 *  编写Order类，有int型的orderId，String型的orderName，
 *  相应的getter()和setter()方法，两个参数的构造器，
 *  重写父类的equals()方法：public boolean equals(Object obj)，
 *  并判断测试类中创建的两个对象是否相等。
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"AA");
        Order order2 = new Order(1001,"BB");
        System.out.println(order1.equals(order2));//false

        Order order3 = new Order(1001,"BB");
        System.out.println(order2.equals(order3));//true

    }
}

class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order order = (Order) obj;
        return getOrderId() == order.getOrderId() &&
                Objects.equals(getOrderName(), order.getOrderName());
    }
}
