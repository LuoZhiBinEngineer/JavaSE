package a5_JavaBean组件_拓展知识;
/*
*   JavaBean是一种Java语言写成的可重用组件
*
*   所谓JavaBean，是指符合如下标准的Java类：
*   1.类是公共的
*   2.有一个无参的公共的构造器
*   3.有属性，且有对应的get、set方法
*
 */

import java.util.SplittableRandom;

public class JavaBean {


   static class Person{

        private String name;
        private int age;

        public Person(){ }

        public void say(int x){
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
}

