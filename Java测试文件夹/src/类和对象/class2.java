package 类和对象;

public class class2 {
    public static void main(String[] args) {
        Food f1 = new Food();
        f1.money = 10;
        f1.name = "chicken";
        f1.eat();
        f1.give();
        //不同的对象都有一套独自的属性
        Food f2 = new Food();
        f2.money = 20;
        f2.name = "shit";
        f2.eat();
        f2.give();
    }
}

class Food {
    int money;
    String name;

    public void eat() {
        System.out.println("吃吃吃!!" + name);
    }

    public void give() {
        System.out.println("给给给" + money);
    }
}
