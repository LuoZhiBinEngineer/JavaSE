package a1;

public class class1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat("chicken");

        Person p2 = p;
        p2.eat("shit");
    }

    static {
        System.out.println("没人调我，但是我执行了！");
    }
}

class Person {
    public void eat(String food) {
        System.out.println("我吃了" + food);
    }
}
