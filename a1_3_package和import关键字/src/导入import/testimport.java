package 导入import;

/*
 * import关键字的使用：
 * 导入：
 * 1.在源文件中显式的使用import结构导入指定包下的类、接口
 * 2.声明在包的声明和类的声明之间
 * 3.如果需要导入多个结构，则并列写出即可
 * 4.使用“xxx.*”的方式，表示可以导入xxx包下的所有结构
 * 5.如果使用的类或接口是java.lang包下定义的，则可以省略import结构
 * 6.如果使用的类或接口是本包下定义的，则可以省略import结构
 * 7.如果在源文件中，使用了不同包下的同名类，则必须至少有一个以全类名的方式显示
 * 8.使用“xxx.*”方式表明可以调用xxx包下的所有结构。但是如果使用的是xxx子包下的结果，则仍需要显式导入
 *
 * 9.import static：导入指定类或接口中的静态结构：属性或方法。
 */
import static java.lang.System.*;
import 包.testpackage;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class testimport {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1,2,3});
        testpackage testpackage = new testpackage();
        out.println("hello");
    }
}
