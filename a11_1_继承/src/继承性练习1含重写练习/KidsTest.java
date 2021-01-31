package 继承性练习1含重写练习;

public class KidsTest {
    public static void main(String[] args) {
        Kids k = new Kids(12);
        k.printAge();

        k.setSex(0);
        k.setSalary(1);

        k.manOrWoman();
        k.employeed();
    }
}
