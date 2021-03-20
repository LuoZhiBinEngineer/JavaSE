package 练习;

/*
 *  使用同步方法的方式来解决继承Thread类的线程安全问题
 *  关于同步方法的总结：
 *  1.同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 *  2.非静态的同步方法，同步监视器是：this。
 *    静态的同步方法，同步监视器是：当前类本身。
 */
class Windows3 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show1();
        }
    }

    public static synchronized void show1() {//此时的同步监视器是当前类（因为static）
        //public synchronized void show1()此种方法是错误的，同步监视器为t1，t2，t3
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Windows3 w1 = new Windows3();
        Windows3 w2 = new Windows3();
        Windows3 w3 = new Windows3();

        w1.start();
        w2.start();
        w3.start();
    }
}