package 练习题之利率;

/*
 *  写一个用户测试程序Account类。在用户程序中，创建一个账号为1122余额为20000，年利率4.5%的Account对象。
 *  使用withdraw方法提款30000元，并打印余额，再使用withdraw方法提款2500元，使用deposit方法存款3000元，
 *  然后打印余额和月利率。
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000, 0.045);

        a.withdraw(30000);
        System.out.println("您的账户余额为：" + a.getBalance());

        a.withdraw(2500);
        System.out.println("您的账户余额为：" + a.getBalance());

        a.deposit(2500);
        System.out.println("您的账户余额为：" + a.getBalance());

        System.out.println("月利率为：" + (a.getMonthlyInterest()) * 100 + "%");
    }
}
