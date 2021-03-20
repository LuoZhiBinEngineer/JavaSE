package 练习;

/*
 *  例子：创建三个窗口卖票，总票数为100张。使用implements Runnable类的方式。
 *  问题：卖票过程中，出现了重票、错票 --> 出现了线程的安全问题
 *  原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票。
 *  解决办法：当一个线程a在操作ticket的时候，其他线程不能参与进来，直到线程a操作完成ticket时，
 *      其他线程才可以开始操作ticket，这种情况即使线程a出现了阻塞，也不能被改变。
 *  在Java中，我们通过同步机制，来解决线程的安全问题。
 *      方式一：同步代码块
 *  synchronize(同步监视器){
 *      //需要被同步的代码
 *  }
 *  说明：1.操作共享数据的代码，即为需要被同步的代码（不能包含过多代码，也不能过少）
 *       2.共享数据：多个线程共同操作的变量。比如：ticket就是共享数据
 *       3.同步监视器，俗称：锁。任何一个类的对象，都可以充当锁。
 *  要求：多个线程必须要用同一把锁。
 *  补充：在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器。
 *      方式二：同步方法
 *  如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明同步的。
 *
 *  好处：解决了线程的安全问题
 *  局限性：操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低。
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w1 = new Window1();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window1 implements Runnable{
    private int ticket = 100;
//    Object obj = new Object();

    @Override
    public void run() {
//        Object obj = new Object();错误
        while (true) {
            //方法一：
            synchronized (this) {//此时的this代表着唯一的window对象
            //方式二：
                if (ticket > 0) {
                    try {
                        Thread.sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}