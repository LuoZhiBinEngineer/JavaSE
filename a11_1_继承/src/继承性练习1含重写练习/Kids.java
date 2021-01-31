package 继承性练习1含重写练习;

/*
 *  定义类Kids继承ManKind，并包括成员变量int yearsOld；
 *  方法printAge()打印yearsOld的值。
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + " years old.");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    /*  重写练习题：
     *  修改继承练习题中定义的类kids，在kids中重新定义employeed()方法，覆盖父类Mankind中定义的employeed()方法，
     *  输出"Kids should study and no job."
     */

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job.");
    }
}
