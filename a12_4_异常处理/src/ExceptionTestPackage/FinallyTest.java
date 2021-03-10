package ExceptionTestPackage;

import org.junit.Test;

public class FinallyTest {

    @Test
    public void testMethod(){
        int num = method();
        System.out.println(num);
    }

    public int method(){
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }
        finally {
            System.out.println("我一定会被执行");
            return 3;
        }
    }

    @Test
    public void test1() {
        try{
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e){
//            e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        }
        finally {
            System.out.println("我好帅啊！~~");
        }
    }
}
