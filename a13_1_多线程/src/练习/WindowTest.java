package 练习;

/*
 *  例子：创建三个窗口卖票，总票数为100张。使用继承Thread的方式。
 *  在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器。
 */

class Windows extends Thread {
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        //正确的
        synchronized (obj) {//windows.class当前类充当同步监视器
            //错误的：
//            synchronized(this)此时的this不唯一，代表着三个对象
            while (true) {
                if (ticket > 0) {
                    System.out.println(getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Windows w1 = new Windows();
        Windows w2 = new Windows();
        Windows w3 = new Windows();

        w1.start();
        w2.start();
        w3.start();
    }
}
