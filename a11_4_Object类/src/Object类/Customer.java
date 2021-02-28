package Object类;

import java.util.Objects;

public class Customer implements Cloneable{
    private int age;
    private String name;

    public Customer() {
        super();
    }

    public Customer(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写的原则：比较两个对象的实体内容（即：name和age）是否相同
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Customer) {
//            Customer cust = (Customer) obj;
//            //比较两个对象的每个属性是否相同
////            if (this.age == cust.age && this.name.equals(cust.name)){
////                return true;
////            }else {
////                return false;
////            }
//            return this.age == cust.age && this.name.equals(cust.name);
//        } else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getAge() == customer.getAge() &&
                Objects.equals(getName(), customer.getName());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }
}
