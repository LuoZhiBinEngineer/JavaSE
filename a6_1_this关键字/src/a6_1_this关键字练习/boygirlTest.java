package a6_1_this关键字练习;

public class boygirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",21);
        boy.Shout();
        Girl girl = new Girl("朱丽叶",20);
        girl.Marry(boy);
        Girl girl1 = new Girl("祝英台",19);
        int compare = girl.compare(girl1);
        if (compare > 0){
            System.out.println(girl.getName()+"大");
        }else if (compare < 0){
            System.out.println(girl1.getName()+"大");
        }else {
            System.out.println("一样大");
        }
    }
}
