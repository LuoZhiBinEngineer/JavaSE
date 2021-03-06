package 基础知识;

/*
 *  final：最终的
 *  1.final可以用来修饰的结构：类、方法、变量
 *  2.final修饰类：此类不能被其他类所继承。
 *      比如：String类、System类、StringBuffer类
 *  3.final用来修饰方法：表明此方法不可以被重写
 *      比如：Object类中getClass();
 *  4.final修饰变量：此时的“变量”就称为一个常量
 *      4.1final修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
 *      4.2final修饰局部变量：尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。
 *          一旦赋值以后，就只能在方法内使用此形参，但不能进行重新赋值。
 *  static final用来修饰属性：全局常量
 */
public class FinalTest {
    final int width = 10;
    final int LEAF;
    final int RIGHT;
//    final int DOWN;
    {
        LEAF = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

    public FinalTest(int n){
        RIGHT = n;
    }

//    public void setDOWN(int down){
//        this.DOWN = down;
//    }

    public void dowidth(){
//        width = 20;Cannot assign a value to final variable 'width'
    }

    public void show(){
        final int NUM = 10;//常量
//        num += 5;
    }
    public void show(final int num){
//        num = 10;//编译不通过
        System.out.println(num);
    }

    public static void main(String[] args) {
        FinalTest test = new FinalTest();
    }
}

final class FinalA{

}

//class B extends FinalA{}
//class B extends String{}

class AA{
    public final void show(){

    }
}
class BB extends AA{
//    @Override
//    public void show() {
//        super.show();
//    }
}