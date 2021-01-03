package 重载的练习题;

/*
 *  1.编写程序，定义三个重载方法并调用。方法名为mOL。
 *    三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 *    分别执行平方运算并输出结果、相乘运算并输出结果、输出字符串信息。
 *    在主类的main()方法中分别用参数区别调用三个方法。
 *
 *  2.定义三个重载方法max()，第一个方法求两个int值中的最大值，
 *      第二个方法求两个double值中的最大值，
 *      第三方法求三个double值中的最大值，
 *      并分别调用三个方法。
 */
public class overloadPractice {
    public static void main(String[] args) {
    operation o = new operation();
        o.mOL(2);
        o.mOL(2,3);
        o.mOL("FUCK");
        o.max(1,2);
        o.max(123,45);
        o.max(5,4,3);
    }
}

class operation {
    public void mOL(int x) {
        System.out.println(x * x);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String m) {
        System.out.println(m);
    }

    public void max(int i, int j) {
        System.out.println(Math.max(i, j));
    }

    public void max(double x, double y) {
        System.out.println(Math.max(x, y));
    }

    public void max(double a, double b, double c) {
        double max = 0;
        for (int i = 0; i < 3; i++) {
            if (max < a) {
                max = a;
            }else if (max < b){
                max = b;
            }else if (max < c){
                max = c;
            }
        }
        System.out.println(max);
    }
}
