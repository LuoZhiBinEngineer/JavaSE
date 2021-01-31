package 继承性练习2圆柱体体积计算;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    //返回圆柱的体积
    public double findVolume() {
        //方法一：
        return Math.PI * getRadius() * getRadius() * length;
        //方法二:
//        return findArea() * getLength();
    }

    @Override
    public double findArea() {//返回圆柱的表面积
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
