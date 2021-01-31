package OverWrite;

public class Student extends Person{
    String major;

    public Student(){

    }
    public Student(String major){
        this.major = major;
    }

    public void study(){
        System.out.println("学习，专业是："+major);
    }
    //对父类中的eat方法进行重写
    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }
}
