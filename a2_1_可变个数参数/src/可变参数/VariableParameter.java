package 可变参数;

/*
 *  可变参数的个数：
 *  1.格式：数据类型...变量名
 *  2.当调用可变个数形参的方法时，传入的参数个数可以是：0个，2个，3个...n。
 *  3.可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载。
 *  4.可变个数参数的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。（即二者不可共存）
 *  5.可变个数形参在方法的形参中，必须声明在末尾
 *  6.可变个数形参在方法的形参中，最多只能声明一个可变形参。
 */
public class VariableParameter {
    public static void main(String[] args) {
        VariableParameter test = new VariableParameter();
        test.show(5);
        test.show("hhh");
        test.show("hhh", "lll", "www");//可变参数个数

    }

    public void show(int i) {

    }

    public void show(String s) {
        System.out.println("show(String)");
    }

    public void show(String... strs) {
        System.out.println("show(String...strs)");
        for (int i = 0; i < strs.length; i++) {//充当了数组的作用
            System.out.print(strs[i] + "\t");
        }
    }
}

