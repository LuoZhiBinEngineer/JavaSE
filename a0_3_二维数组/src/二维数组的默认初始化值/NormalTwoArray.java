package 二维数组的默认初始化值;

/*
*   1.规定：二维数组分为外层数组的元素，内层数组的元素
*   int[][] array = new int[4][3];
*   外层元素:array[0],array[1]等
*   内层元素:array[0][0],array[1][2]等
*
*   2.数组元素的默认初始化值
*   针对初始化方式1：int[][] array1 = new int[4][3];
*   外层元素的初始化值：地址值
*   内层元素的初始化值：与一位数组的初始化相同
*
*   针对初始化方式2：int[][] array2 = new int[4][];
*   外层元素的初始化值：null
*   内层元素的初始化值：不能调用，报错（空指针异常）
*
*   3.二维数组的内存解析
 */

public class NormalTwoArray {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        System.out.println(array[0]); //二维数组的外层元素，输出的是地址值[I@10f87f48，值前有[代表一维数组
        System.out.println(array[0][0]); //二维数组的内层元素，输出的是数值0
        System.out.println(array);//输出地址值[[I@b4c966a，值前[[代表二维数组，I代表为int型，@代表在...位置

        System.out.println("***************************");

        float[][] array1 = new float[4][3];
        System.out.println(array1[0]);//可以清楚的看到地址值里的数据类型变成了F
        System.out.println(array1[0][0]);//输出0.0

        System.out.println("***************************");

        String[][] array2 = new String[4][3];
        System.out.println(array2[0]);
        System.out.println(array[0][0]);
    }
}
