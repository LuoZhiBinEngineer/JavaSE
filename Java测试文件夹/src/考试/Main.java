package 考试;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<答题类>   array1 = new ArrayList<>();
        ArrayList<答题类>   array3 = new ArrayList<>();
        ArrayList<答题类>   array9 = new ArrayList<>();
        ArrayList<答题类>   array2 = new ArrayList<>();
        ArrayList<答题类>   array4 = new ArrayList<>();
        ArrayList<答题类>   array6 = new ArrayList<>();


        String a;
        String b;


        答题类 T1 = new 答题类("0", "1. Java源文件名与public类名可以不同。（  ）");
        答题类 T2 = new 答题类("1", "2.构造方法是类的一种特殊的方法，它的方法名必须与类名相同。（   ）");
        答题类 T3 = new 答题类("0", "3.数组的下标从1开始。（    ）");
        答题类 T4 = new 答题类("1", "4.不管try和catch语句中是否会出现异常,finally的语句都会执行。（   ）");
        答题类 T5 = new 答题类("0", "5.子类覆盖父类方法时，子类对父类的同名方法将不能再做访问。（    ）");
        答题类 T6 = new 答题类("1", "6. 每个对象都有一个名为this的引用，它指向当前对象本身。（   ）");
        答题类 T7 = new 答题类("1", "7. 使用static修饰符的成员变量是类变量。（   ）");
        答题类 T8 = new 答题类("1", "8.子类可以继承父类中的public和protected成员。（   ）");
        答题类 T9 = new 答题类("1", "9.类中被限定为私有（private）的成员只能被这个类本身的方法访问。（  ）");
        答题类 T10 = new 答题类("1", "10.java的接口支持多继承机制。（   ）");
        答题类 T11 = new 答题类("0", "11.一个扩展名为.java的源文件只能包含一个类，并且最多只能有一个公共类。（    ）");
        答题类 T12 = new 答题类("0", "12.Panel(面板)默认的布局管理器是边界布局管理器。（    ）");
        答题类 T13 = new 答题类("1", "13. 声明抽象方法使用的关键字是abstract。（   ）");
        答题类 T14 = new 答题类("1", "14. 含有抽象方法的类一定是抽象类。（   ）");
        答题类 T15 = new 答题类("1", "15.一个类可以实现多个接口，表示一种多继承关系。（   ）");
        答题类 T16 = new 答题类("1", "16.内部类是定义在另一个类体中的类，也可以包含属性和方法。（   ）");
        答题类 T17 = new 答题类("1", "17. 子类可以拥有自己的属性和方法。（   ）");
        答题类 T18 = new 答题类("1", "18.子类可以继承父类的所有成员。（  ） ");
        答题类 T19 = new 答题类("1", "19.声明抽象方法使用的关键字是abstract。（  ）");
        答题类 T20 = new 答题类("0", "20.内部类不能直接访问外部类的private成员。（  ）");
        答题类 T21 = new 答题类("1", "21.如果没有指定接口中成员变量和成员方法的访问权限，Java将其隐式地声明为public。（  ）");
        答题类 T22 = new 答题类("1", "22.JFrame对象创建后，默认是不可见的。（  ）");
        答题类 T23 = new 答题类("0", "23.包只能定义一层，即包中不能再有包。（  ）");
        答题类 T24 = new 答题类("0", "24.FileReader是属于字节流。（    ）");
        答题类 T25 = new 答题类("1", "25.一段代码里面可以抛出多个异常（）");
        答题类 T26 = new 答题类("0", "26.程序编译错误也是属于异常的一种（）");
        答题类 T27 = new 答题类("1", "27.数组在赋初值时不判断数组边界（）");
        答题类 T28 = new 答题类("0", "28.在一个类中，可以定义零个或多个构造方法。（  ） ");
        答题类 T29 = new 答题类("1", "29.静态变量可以直接通过类名进行访问，其生命周期取决于类的生命周期。（  ）");
        答题类 T30 = new 答题类("1", "30. 每个对象都有一个名为this的引用，它指向当前对象本身。（  ）");
        答题类 T31 = new 答题类("0", "31.抽象类可以被实例化。（  ）");
        答题类 T32 = new 答题类("0", "32.JFrame在默认情况下是会自己显示的（）");
        答题类 T33 = new 答题类("1", "33.菜单JMenu里面还可以添加JMenu()");


        答题类 B1 = new 答题类("引用型", "1. Java语言中变量的两种基本类型是：基本型和（       ）。");
        答题类 B2 = new 答题类("代码块内", "2.Java程序中类的成员变量定义在方法外，而局部变量是定义在（       ）。");
        答题类 B3 = new 答题类("Exception", "3.自定义异常类必须继承（      ）类 ");
        答题类 B4 = new 答题类("类", "4.Java程序的基本单位是：（      ）。");
        答题类 B5 = new 答题类("循环结构", "5.Java程序的三种基本结构是：顺序结构、选择结构和（      ）。");
        答题类 B6 = new 答题类("字节", "6.Java 输出输入流按流的单位分类分别是（       ）流和字符流。");
        答题类 B7 = new 答题类("字符", "7.Java 输出输入流按流的单位分类分别是字节流和（      ）流。");
        答题类 B8 = new 答题类("本类当前", "8.Java程序中this用来代表（       ）对象。");
        答题类 A1 = new 答题类("A", "1.下面工具中（ ）是JDK中提供的编译工具。\n" +
                "A.javac       B．javap         C．java        D．jar      \n" +
                "\n" );

        答题类 A2 = new 答题类("B", "2. 编译Java Application源程序文件将产生相应的字节码文件" +
                "，这些字节码文件的扩展名为（  ）。\n" +
                "A．Java     B．class      C．html       D．exe  \n" +
                "\n");

        答题类 A3 = new 答题类("A", "3.以下关于构造方法说法错误的是（）。                                                                                                                                                                                                                                                                                                                                                                                                                           \n" +
                "A．构造方法的返回类只能是void型  B．构造方法名必须与类名相同    \n" +
                "C．构造方法主要是完成对象的初始化工作  D．创建对象时系统自动调用构造方法\n" +
                "\n");

        答题类 A4 = new 答题类("C", "4.成员变量与局部变量重名时，若想在方法内使用成员变量，要使用（  ）。                                                                                                                                                                                                                                                                                                                                                                                                                                                    \n" +
                " A．super      B．import    C．this      D．return\n" +
                "\n");

        答题类 A5 = new 答题类("B", "5.下列的数组声明形式中，错误的是（  ）。                                                                                                                                                                                                                                                                                                                                                                                                                                                     \n" +
                "A．float a[]                  B．float a[5]\n" +
                "C．int a[] = new int[5]       D．float[] a \n" +
                "\n");

        答题类 A6 = new 答题类("C", "6.抽象类中不应包含（  ）。                                                                                                                                                                                                                                                                                                                                                                                                                                                     \n" +
                "A．常量定义   B．常量赋值  \n" +
                "C．方法实现   D．方法声明\n" +
                "\n");

        答题类 A7 = new 答题类("D", "7.声明接口的关键字是（  ）。                                                                                                                                                                                                                                                                                                                                                                                                                                                   \n" +
                " A．public         B．package  \n" +
                " C．abstract       D．interface\n" +
                "\n");

        答题类 A8 = new 答题类("B", "8.以下哪一种是Java提供的访问权限修饰符（  ）。                                                                                                                                                                                                                                                                                                                                                                                                                                                    \n" +
                " A．extends      B．private      \n " +
                " C．final        D．abstract\n" +
                "\n");

        答题类 A9 = new 答题类("C", " 9.鼠标按下时会产生（  ）事件。\n" +
                "．ActionEvent     B．ItemEvent    \n" +
                " C．MouseEvent    D．KeyEvent \n" +
                "\n");

        答题类 A10 = new 答题类("B", "下列不是重载方法特征的是（  ）。\n" +
                " A．参数个数不同               B．没有返回值   \n" +
                " C．参数类型不同                D．方法名相同\n" +
                "\n");

        答题类 A11 = new 答题类("B", "11.下列OutputStream类中（  ）方法可以把字节流写入到外部文件中。\n" +
                "  A．skip()        B．write()    \n  " +
                "  C．mark()        D．reset()\n" +
                "\n");

        答题类 A12 = new 答题类("C", "12.关于构造方法的说法正确的是（    ）\n" +
                " A.一个类只能有一个构造方法。      B.一个类可以有多个不同名的构造方法。\n" +
                " C.构造方法与类同名。            D.构造方法里面不能使用父类的构造方法 \n" +
                "\n");

        答题类 A13 = new 答题类("A", "13.下列方法中，可以改变容易布局的方法是（    ）\n" +
                "A.setLayout(layoutManager)       B.setLayoutManager(layoutManager)\n" +
                "C.addLayout(layoutManager)       D.addLayoutManager(layoutManager)\n" +
                "\n");

        答题类 A14 = new 答题类("B", "14.下列不属于容器组件的是（    ）\n" +
                "A.JFrame         B.JButton   \n     " +
                " C.JPanel        D.JApplet\n" +
                "\n");

        答题类 A15 = new 答题类("C", "15.不属于Java输入输出流分类的是（    ） \n" +
                "A.字节流         B.字符流      \n     " +
                "C.随机流        D.节点流\n" +
                "\n");

        答题类 A16 = new 答题类("B", "16.下面哪个是main方法的正确写法（  ）。\n" +
                "A．void main()        B．public static void main(String args[])\n" +
                "C．public main(String args[])     D．main()\n" +
                "\n");

        答题类 A17 = new 答题类("A", "17.声明一个类的关键字是（  ）。 \n" +
                "A．class      B．interface    \n  " +
                "C．import      D．implements\n" +
                " \n");

        答题类 A18 = new 答题类("C", "19.Java是使用（）关键字来表示某一个类继承父类。  \n" +
                "A．interface    B．package    \n  " +
                "C．extends     D．class\n" +
                "\n");

        答题类 A19 = new 答题类("C", "20.不属于Java I/O流分类的是（） \n" +
                "A.字节流         B.字符流     \n" +
                "  C.随机流        D.节点流\n" +
                "\n");

        答题类 A20 = new 答题类("B","22. 以下哪一种不是Java提供的访问权限修饰符（  ）。\n" +
                "A．public     B．static  \n   " +
                "C．protected   D．private\n" +
                "\n" );

        答题类 A21 = new 答题类("C","23. 鼠标移动时会产生（  ）事件。\n" +
                "A．ActionEvent   B．ItemEvent  \n " +
                "C．MouseEvent   D．KeyEvent\n" +
                "\n" );

        答题类 A22 = new 答题类("B","24. 下列不是重载方法特征的是（    ）。\n" +
                " A．参数个数不同               B．返回值类型不同 \n " +
                "C．参数类型不同               D．方法名相同\n" +
                "\n" );

        答题类 A23 = new 答题类("B","25. 下列InputStream类中（    ）方法可以用于关闭流。 \n " +
                "A．skip()        B．close()   \n  " +
                "C．mark()       D．reset()\n" +
                "\n" );

        答题类 A24 = new 答题类("A","26.使用关键字（    ）定义一个接口。\n" +
                "A．interface     B．package \n    " +
                "C．extends      D．class\n" +
                "\n");

        答题类 A25 = new 答题类("A","27.下面关于接口正确的说法是（    ）\n" +
                "A.实现一个接口必须实现接口的所有方法。   B.一个类只能实现一个接口。\n" +
                "C.接口之间不能有继承关系。               D.接口可以有自己的变量。\n" +
                "\n" );

        //添加题目
        array3.add(A1);array3.add(A2);array3.add(A3);array3.add(A4);array3.add(A5);
        array3.add(A6);array3.add(A7);array3.add(A8);array3.add(A9);array3.add(A10);
        array3.add(A11);array3.add(A12);array3.add(A13);array3.add(A14);array3.add(A15);
        array3.add(A16);array3.add(A17);array3.add(A19);
        array3.add(A22);array3.add(A23);array3.add(A24);array3.add(A25);
        array3.add(A20);array3.add(A18);array3.add(A21);

        array1.add(T1);array1.add(T2);array1.add(T3);array1.add(T4);array1.add(T5);array1.add(T9);array1.add(T10);array1.add(T11);
        array1.add(T12);array1.add(T13);array1.add(T14);array1.add(T15);array1.add(T16);array1.add(T17);array1.add(T18);array1.add(T19);array1.add(T20);
        array1.add(T21);array1.add(T22);array1.add(T23);array1.add(T24);array1.add(T25);array1.add(T26);array1.add(T27);array1.add(T28);array1.add(T29);array1.add(T30);array1.add(T31);
        array1.add(T32);array1.add(T33);

        array1.add(T6);array1.add(T7);array1.add(T8);


        array9.add(B1);array9.add(B2);array9.add(B3);array9.add(B4);array9.add(B5);array9.add(B6);array9.add(B7);array9.add(B8);


        while (true) {
            System.out.println("\n");
            System.out.println("*******************************************************************************");
            System.out.println("*****************输入你需要练习的题目 1选择题 2填空题 3判断题 4退出********************* " +
                    "\n**********************************************************************************");
            b = sc.next();
            if (b.equals("2")){
                System.out.println("输入填空题答案        输入9：退出");
                Collections.shuffle(array9);
                for (答题类 D : array9) {
                    System.out.println(D.get题目());
                    a = sc.next();
                    if (a.equals("9")) {

                        break;
                    }
                    if (a.equals(D.get答案())) {

                        System.out.println("回答正确,牛逼！！");
                    } else {
                        System.out.println("回答错误，答案为："+D.get答案());
                        array6.add(D);
                    }
                }
                System.out.println("**************************************");
                System.out.println("********共答错" + array6.size() + "题" + "您答错的题为**********");
                System.out.println("**********爸爸只能帮你怎么多了*********");
                System.out.println("**************************************");
                for (答题类 B : array6) {
                    System.out.println(B);
                }
                array6.clear();
            }

            if (b.equals("1")) {
                System.out.println("输入您的答案 A  B  C  D      输入2：退出（菠萝仔记得大写）");
                Collections.shuffle(array3);
                for (答题类 A : array3) {
                    System.out.println(A.get题目());
                    a = sc.next();
                    if (a.equals("2")) {
                        break;
                    }
                    if (a.equals("A") == false && a.equals("B") == false && a.equals("C") == false && a.equals("D") == false) {
                        System.out.println("细心认真点！！！！！");
                        array2.add(A);
                    }
                    if (a.equals(A.get答案())) {
                        System.out.println("回答正确,牛逼！！");
                    } else {
                        System.out.println("回答错误，答案为："+A.get答案());

                        array4.add(A);
                    }
                }
                System.out.println("**************************************");
                System.out.println("********共答错" + array4.size() + "题" + "您答错的题为**********");
                System.out.println("**********爸爸只能帮你怎么多了*********");
                System.out.println("**************************************");
                for (答题类 B : array4) {
                    System.out.println(B);
                }
                array4.clear();

            }
            if (b.equals("3")) {
                System.out.println("输入您的答案 输入0 为错   输入1为 对  输入2：退出");
                Collections.shuffle(array1);
                for (答题类 A : array1) {
                    System.out.println(A.get题目());
                    a = sc.next();
                    if (a.equals("2")) {
                        break;
                    }
                    if (a.equals("1") == false && a.equals("0") == false) {
                        System.out.println("细心认真点！");
                        array2.add(A);
                    }
                    if (a.equals(A.get答案())) {
                        System.out.println("回答正确,牛逼！！");
                    } else {
                        System.out.println("回答错误，答案为："+A.get答案());
                        array2.add(A);
                    }
                }
                System.out.println("**************************************");
                System.out.println("**********共答错" + array2.size() + "题" + "您答错的题为*********");
                System.out.println("**********爸爸只能帮你怎么多了*********");
                System.out.println("**************************************");
                for (答题类 B : array2) {
                    System.out.println(B);
                }
                array2.clear();

            }
            if (b.equals("4")) {
                System.exit(0);
            }
        }

    }
}
class 答题类 {
    private String 答案;
    private String 题目;

    public 答题类(String TF, String TM) { this.答案 = TF;this.题目 = TM; }
    public 答题类() { }
    public String get答案() { return 答案; }
    public void set答案(String 答案) { this.答案 = 答案; }
    public String get题目() { return 题目; }
    public void set题目(String 题目) { this.题目 = 题目; }
    @Override
    public String toString() {
        return "答题类{" +
                "TF='" + 答案 + '\'' +
                ", TM='" + 题目 + '\'' +
                '}';
    }
}
