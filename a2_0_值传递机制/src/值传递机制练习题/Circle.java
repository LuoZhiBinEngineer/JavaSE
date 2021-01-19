package 值传递机制练习题;

/*
 *  定义一个Circle类，包含一个double型的radius属性代表圆的半径，
 *  一个findArea()方法返回圆的面积。
 */
public class Circle {
        double Radius;

        public double findArea(){
            return Math.PI * Radius * Radius;
        }
}
