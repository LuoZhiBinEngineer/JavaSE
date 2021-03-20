package 多线程基础;

/*
 *  多线程的创建，方式一：继承于Thread类
 *  1.创建一个继承于Thread类的子类
 *  2.重写Thread类的run() --> 将此线程执行的操作声明在run()中
 *  3.创建Thread类的子类的对象
 *  4.通过此对象调用start()：①启动当前线程 ②调用当前线程的run()
 *
 *  例子：遍历100以内的所有偶数
 */

//创建一个继承于Thread类的子类
class myThread extends Thread{
    //重写Thread类的run()
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //创建Thread类的子类的对象
        myThread t1 = new myThread();
        //通过此对象调用start()：①启动当前线程 ②调用当前线程的run()
        t1.start();
        //问题一：不能通过直接调用run()的方式启动线程
        //t1.run();
        //问题二：不可以让已经start()的线程去执行，否则会报IllegalThreadStateException
//        t1.start();
        //我们需要重新创建一个线程的对象
        myThread t2 = new myThread();
        t2.start();

        //如下操作仍然是在main线程中进行的
        for (int i = 0; i <100; i++) {
            if (i % 2 == 0){
                System.out.println(i + "main()");
            }
        }
    }
}
