package 继承性练习2圆柱体体积计算;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(2.1);
        c.setLength(3.4);
        double volume = c.findVolume();
        System.out.println("圆柱的体积为：" + volume);

        //没有重写findArea()时：
//        double area = c.findArea();
//        System.out.println("底面圆的面积为：" + area);

        //重写后：
        double area = c.findArea();
        System.out.println("圆柱的表面积为：" + area);
    }
}
