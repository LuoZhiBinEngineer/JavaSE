package Arry;

/*
*   1.定义：数组是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，
*     并通过编号的方式对这些数据统一管理。
*
*   2.特点：
*   ①数组有序排列的。
*   ②数组属于引用数据类型的变量。
*   ③创建数组后会在内存中开辟一段连续的空间。
*   ④数组的长度一旦确定，就不能修改。
*
 */

import java.util.Arrays; //导入数组包

public class Array {
    public static void main(String[] args) {
        int[] a; //或int a[]; 中括号可在前可在后，建议使用前者。
        //数组声明后也必须进行初始化才能使用，用new创建数组对象。 new 元素类型[第一维][第二维]...
        int[] b = new int[]{1,2,3}; //静态初始化，可简写为int[] b = {1,2,3};
        int[] s = new int[]{};
        for (int i=0;i<3;i++) {
            System.out.println(b);//遍历输出数组内元素的地址

        }
        System.out.println(Arrays.toString(b));//输出数组b里的元素
        System.out.println(s);
        System.out.println(Arrays.toString(s));
    }
}
