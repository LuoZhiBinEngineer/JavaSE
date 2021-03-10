package ExceptionTestPackage;

import org.junit.Test;

/*
* try{
	//可能出现异常的代码
}catch(异常类型1 变量名1){
	//处理异常的方式1
}catch(异常类型2 变量名2){
	//处理异常的方式2
}catch(异常类型3 变量名3){
	//处理异常的方式3
}
...
//可以根据需要添加处理异常的方式，catch的效果相当于switch()里的case
finally{
	//一定会执行的代码
}
*   说明：
* 1. finally是可选的。
* 2. 使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配
* 3. 一旦try中的异常对象匹配到某一个catch时，就进入catch进行异常的处理。一旦完成处理，就跳出当前的try-catch结构（在没有写finally的情况），继续执行后面的代码
* 4. catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。
    catch中的异常类型如果有子父类关系，则要求子类一定声明在父类的上面，否则报错。
* 5. 常用的异常对象处理的方式：①String getMessage()  ②printStackTrace()
* 6. 在try结构中声明的变量，在出了try结构以后，就不能再被调用了。
* 7. finally中声明的是一定会被执行的代码。即使catch又出现异常了，try中有return语句，catch中有return语句等情况。
* 8. try-catch-finally结构可以互相嵌套
*/
public class ExceptionTest1 {
    @Test
    public void test1() {
        String str = "123";
        str = "abc";
        int num = 0;//提前声明变量，方便异常外调用
        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
//            System.out.println("出现数值转换异常了，不要急，我们处理掉啦");
            e.printStackTrace();//开发时使用这个
            System.out.println("看看我有没有执行");
        } catch (NullPointerException e) {
            System.out.println("出现空指针异常了，不要急，我们处理掉啦");
        }
        System.out.println(num);
        System.out.println("看看处理完后我还能执行吗");
    }
}
