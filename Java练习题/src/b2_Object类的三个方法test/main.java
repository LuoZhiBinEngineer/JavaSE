package b2_Object类的三个方法test;

import java.util.Arrays;

public class  main implements Cloneable{

    public static void main(String[] args) throws CloneNotSupportedException{
        rational x = new rational(1,2);
        rational y = new rational(1,2);
        rational z = new rational(2,4);
        //equals方法
        System.out.println("equals的方法为"+x.equals(x));
        //toString方法
        System.out.println("toString的方法为"+x.toString());
        //clone后的值
        rational b = x.clone();
        b.setDenominator(1);
        b.setNumerator(4);
        System.out.println("clone后的值为："+b);
        //sort排序
        rational[] a = {x,y,z};
        Arrays.sort(a);
        for(rational s:a) {
            System.out.printf("%s",s);
        }
    }
}