package a6_1_this关键字练习;

public class Girl {
    private String name;
    private int age;

    public Girl(){ }

   public void Marry(Boy boy){
       System.out.println("我想嫁给"+boy.getName());
       boy.Marry(new Girl()); //匿名对象
   }


   public int compare(Girl girl){
//        if (this.age > girl.age){
//            return 1;
//        }else if (this.age < girl.age){
//            return -1;
//        }else {
//            return 0;
//        }
       return this.age - girl.age;
   }

    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
