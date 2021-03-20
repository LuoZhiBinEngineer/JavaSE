package 多线程基础;

/*
 * Thread类的常用方法：
 - void start()：启动线程，并执行对象的run()方法
 - run()：线程在被调度时执行的操作
 - String getName()：返回线程的名称
 - void setName(String name)：设置该线程名称
 - static Thread currentThread()：返回当前线程。在Thread子类中是this，通常用于主线程和Runnable实现类。
 - static void yield()：线程让步。①暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程 ②若队列中没有同优先级的线程，忽略此方法。
 - join()：当某个程序执行流中调用其他线程的join()方法时，调用线程将被阻塞，直到join()方法加入的join线程执行完为止（低优先级的线程也可以获得执行）
 - static void sleep(long millis)：（指定时间：毫秒）①令当前活动线程在指定时间段内放弃对CPU控制，使其他线程有机会被执行，时间到后重新排队 ②抛出InterruptedException异常
 - stop()：强制线程生命期结束，不推荐使用。
 - boolean isAlive()：返回boolean，判断线程是否还活着。
 */

import javax.naming.Name;

public class ThreadMethodTest {
    public static void main(String[] args) {
        Method h1 = new Method("Thread : 1");

        h1.setName("线程一：");
        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);

        h1.start();
        //给主线程命名
        Thread.currentThread().setName("主线程：");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }
//            if (i % 20 == 0){
//                try {
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
//        System.out.println(h1.isAlive());
    }
}

class Method extends Thread {
    public Method(String Name){
        super(Name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                try {
//                    sleep(20);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }
//            if (i % 20 == 0){
//                this.yield();
//            }

        }
    }
}