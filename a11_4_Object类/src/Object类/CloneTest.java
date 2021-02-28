package Object类;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer cc = new Customer();
        cc.setAge(18);
        cc.setName("张三");

        Customer cc2 = cc.clone();
        System.out.println(cc+"："+cc.hashCode());
        System.out.println(cc2+"："+cc2.hashCode());
    }
}
