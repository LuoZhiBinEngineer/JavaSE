package 练习;

/*
 *  使用同步方法解决实现Runnable接口的线程安全问题
 */
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w2 = new Window2();

        Thread t1 = new Thread(w2);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w2);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window2 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();

        }
    }

    public synchronized void show(){//同步监视器为this
        if (ticket > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
            ticket--;
        }
    }
}