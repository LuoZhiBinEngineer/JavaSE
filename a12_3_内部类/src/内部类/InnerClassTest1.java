package 内部类;

//4.3 开发中局部内部类的使用
public class InnerClassTest1 {
    //少见
    public void method(){
        class AA{

        }
    }

    //返回一个实现了Comparable接口的类的对象
    public Comparable comparable(){
        //创建一个实现Comparable接口的类的对象
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

        //方式二：
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

}
