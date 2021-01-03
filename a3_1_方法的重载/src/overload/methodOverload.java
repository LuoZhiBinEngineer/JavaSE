package overload;

/*
 *  方法的重载（overload）：
 *  1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 *      相同：同一个类、相同的方法名；
 *      不同：参数列表不同，参数个数不同，参数类型不同。
 *  2.判断是否重载：
 *      跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
 *  3.在通过对象调用方法时，如何确定某一个指定的方法：
 *      方法名-->参数列表（如sub(int i,int b)或sub(string a,string b)）
 */
public class methodOverload {
    public static void main(String[] args) {
        methodOverload test = new methodOverload();
        test.getSum(1, 2);
    }

    //以下的几种方法构成了重载
    public void getSum(int i, int j) {
        System.out.println(i + j);
    }

    public void getSum(double d1, double d2) {
        System.out.println();
    }

    public void getSum(String s, int i) {

    }
    //错误方法
    /*
    public void getSum(int m,int n){

    }
    public int getSum(int i,int j){
        return 0;
    }
    private void getSum(int i,int j){

    }
    */
}
