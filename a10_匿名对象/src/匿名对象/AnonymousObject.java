package 匿名对象;
/*
 *  匿名对象：
 *  1.我们创建的对象，我们没有显式的赋予一个变量，即为匿名对象。
 *  2.特征：匿名对象只能使用一次就会被回收。
 *
 */
public class AnonymousObject {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
//        p.playGame();
//        p.sendEmail();
        //实际上这是“两部手机”
        new Phone().price = 1999;
        new Phone().price();//结果为0.0

        PhoneMall mall = new PhoneMall();
        //匿名对象的使用
        mall.show(new Phone());
    }
}
class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
class Phone {
    double price;

    public void sendEmail() {
        System.out.println("发邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

    public void price() {
        System.out.println("手机的价格为：" + price);
    }
}