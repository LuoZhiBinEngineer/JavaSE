package b3_各类图形的运算;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle s1 = new Rectangle(); //创建对象
        Circle s2 = new Circle();
        Triangle s3 = new Triangle();

        while (true) {
            System.out.println("1.矩形");
            System.out.println("2.圆形");
            System.out.println("3.三角形");
            System.out.println("0.退出");
            System.out.println("请选择要运算的图形：");
            String m = sc.next();
            if(m.equals("0")){
                System.out.println("See You Again!");
                break;
            }
            switch(m) {
                case "1":{ //优化人机交互
                    System.out.println("a.面积运算");
                    System.out.println("b.周长运算");
                    System.out.println("请选择要运算的方式");
                    String n = sc.next();
                    System.out.println("请输入矩形的长：");
                    s1.setA(sc.nextDouble());
                    System.out.println("请输入矩形的宽：");
                    s1.setB(sc.nextDouble());
                    if (n.equals("a")){
                        System.out.println("矩形的面积为："+s1.getArea());
                    }
                    if (n.equals("b")){
                        System.out.println("矩形的周长为："+s1.getPerimeter());
                    }
                    break;
                }
                case "2":{
                    System.out.println("a.面积运算");
                    System.out.println("b.周长运算");
                    System.out.println("请选择要运算的方式");
                    String n = sc.next();
                    System.out.println("请输入圆形的半径：");
                    s2.setR(sc.nextDouble());
                    if (n.equals("a")){
                        System.out.println("圆形的面积为："+s2.getArea());
                    }
                    if (n.equals("b")){
                        System.out.println("圆形的周长为："+s2.getPerimeter());
                    }
                    break;
                }
                case "3":{
                    System.out.println("a.面积运算");
                    System.out.println("b.周长运算");
                    System.out.println("请选择要运算的方式");
                    String n = sc.next();
                    System.out.println("请输入三角形的第一个边：");
                    s3.setX(sc.nextDouble());
                    System.out.println("请输入三角形的第二个边：");
                    s3.setY(sc.nextDouble());
                    System.out.println("请输入三角形的第三个边：");
                    s3.setZ(sc.nextDouble());
                    if (n.equals("a")){
                        System.out.println("三角形的面积为："+s3.getArea());
                    }
                    if (n.equals("b")){
                        System.out.println("三角形的周长为："+s3.getPerimeter());
                    }
                    break;
                }
            }
        }
    }
}
