package Lock锁解决线程安全问题;

import java.util.concurrent.locks.ReentrantLock;

/*
 *  解决线程安全问题的方式三：LOck锁 ---JDK 5.0 新特性
 *
 *  1.面试题：synchronized 与 Lock的异同？
 *  相同：二者都可以解决线程安全问题
 *  不同：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
 *      而Lock需要手动的启动同步（Lock()），同时结束同步也需要手动的实现（unLock()）
 */
public class LockTest {
    public static void main(String[] args) {
        Windows10 w = new Windows10();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Windows10 implements Runnable {
    private int ticket = 100;
    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {
                //2.调用锁定方法lock();
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                } else {
                    break;
                }
            } finally {
                //调用解锁方法unlock();
                lock.unlock();
            }
        }
    }
}