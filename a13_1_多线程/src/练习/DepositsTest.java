package 练习;

/*
 *  两个账户分别向一个账户存款3000元，每次存1000元，分别存3次。保证线程的安全性。
 */
public class DepositsTest {
    public static void main(String[] args) {
        Account acct = new Account(0);

        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}

class  Account{
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public synchronized void Deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println(Thread.currentThread().getName() + "存款成功。余额为：" + balance);
        }
    }
}

class Customer extends Thread{
    private Account acct;

    public Customer(Account acct){
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acct.Deposit(1000);
        }
    }
}