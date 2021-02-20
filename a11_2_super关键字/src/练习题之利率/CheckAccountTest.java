package 练习题之利率;

/*
 *  写一个用户程序测试CheckAccount类。
 *  在用户程序中，创建一个账号为1122，余额为20000，年利率4.5%，可透支限额为5000元的CheckAccount对象。
 *  1.使用withdraw方法提款5000元，并打印账户余额和可透支额。
 *  2.使用withdraw方法提款18000元，并打印账户余额和可透支额。
 *  3.使用withdraw方法提款3000元，并打印账户余额和可透支额。
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount c = new CheckAccount(1122,20000,0.045,5000);

        c.withdraw(5000);
        System.out.println("您的账户余额为："+c.getBalance());
        System.out.println("您可透支的额度为："+c.getOverdraft());

        c.withdraw(18000);
        System.out.println("您的账户余额为："+c.getBalance());
        System.out.println("您可透支的额度为："+c.getOverdraft());

        c.withdraw(3000);
        System.out.println("您的账户余额为："+c.getBalance());
        System.out.println("您可透支的额度为："+c.getOverdraft());
    }
}
