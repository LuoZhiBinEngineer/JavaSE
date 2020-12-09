package a6_1_this关键字练习;

public class Boy {
    private String name;
    private int age;

    public Boy() { }

    public void Marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
        
    }
    public void Shout(){
        if (this.age >= 22){
            System.out.println("你可以结婚了！");
        }else {
            System.out.println("先多谈谈恋爱!");
        }
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
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
