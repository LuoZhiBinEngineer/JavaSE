package 值传递机制练习题;

/*
 *  定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *      public void printAreas(Circle c,int time)
 *  在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *  例如：time为5，则输出半径1,2,3,4,5，以及对应的圆面积。
 *
 *  在main方法中调用printAreas()方法，调用完毕后输出当前半径值。列表形式输出。
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c, 5);
        System.out.println("Now Radius is "+c.Radius);
    }

    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tArea");

        for (int i = 1; i <= time; i++) {
            //设置圆的半径
            c.Radius = i;//每个i赋给Radius传到Circle类中
            System.out.println(c.Radius + "\t\t" + c.findArea());
        }
        c.Radius = time + 1;
    }
}
