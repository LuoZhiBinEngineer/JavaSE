package 练习;

public class ThreadDemo {
    public static void main(String[] args) {
        Method1 m1 = new Method1();
        Method2 m2 = new Method2();

        m1.start();
        m2.start();

        //方式二：创建Thread匿名子类的方式
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if (i % 2 == 0){
//                        System.out.println(Thread.currentThread().getName() + i);
//                    }
//                }
//            }
//        }.start();
//
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if (i % 2 != 0){
//                        System.out.println(Thread.currentThread().getName() + i);
//                    }
//                }
//            }
//        }.start();
    }
}

class Method1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

class Method2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}