package 多态性的使用;

import java.awt.font.TextAttribute;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }

    public void func(Animal animal){//Animal animal = new Dog();
        animal.eat();
        animal.shout();
    }
}

class Animal {
    public void eat() {
        System.out.println("动物：进食");
    }

    public void shout() {
        System.out.println("动物：叫");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪！汪！汪！");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵!喵!喵!");
    }
}
