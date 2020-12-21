package 一维数组的默认初始化值;

/*
 *   一.数组元素的默认初始化值
 *   1.数组元素是整型：0
 *   2.数组元素是浮点型：0.0
 *   3.数组元素是char：0或'\u0000'，而非'0'
 *   3.数组元素是Boolean型：false
 *   3.数组元素是String(引用)类型：null
 *
 *   二.一维数组的内存解析
 *   栈stack，堆heap
 */

public class Normal {
    public static void main(String[] args) {
        //数组元素是整型
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //数组元素是浮点型
        float[] array1 = new float[2];
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //数组元素是char型
        char[] array2 = new char[2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        if (array2[0] == 0) {
            System.out.println("数组内的元素确实是0");
        }
        //数组元素是Boolean型
        boolean[] array3 = new boolean[1];
        System.out.println(array3[0]);
        //数组元素是String类型
        String[] array4 = new String[1];
        System.out.println(array4[0]);
        if (array4[0] == null) {
            System.out.println("String数组内的元素确实是null");
        }
    }
}
