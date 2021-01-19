package 递归;

/*
 * 递归方法（工作需要,现阶段仅作了解）
 * 1.概述：一个方法体内调用它自身。
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制。
 * 3.递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 */
public class RecursiveMethod {
    public static void main(String[] args) {
        //例题1：计算1-100之间所有自然数的和：


        //方式二（递归）：
        RecursiveMethod test = new RecursiveMethod();
        int result = test.getSum(100);
        System.out.println(result);
        /* ***************************** */
        double fn = test.f(10);
        System.out.println(fn);
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    //例题2：计算1-100之间所有自然数的乘积
    public int getCom(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum(n - 1);
        }
    }

    /*  例题3：已知有一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),
         其中n是大于0的整数，求f(10)的值。            */
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }
}
