package 数组的复制;

/*
 * (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，都为int型数组。
 * (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
 * (3)显示array1的内容。
 * (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值，
 *    如array[0]=0，array[2]=2。打印出array1。
 * 思考：array1和array2是什么关系？
 *    答：array1和array2地址值相同，都指向了堆空间的唯一的实体数组。
 * 拓展：实现array2对array1数组的复制。
 */

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //显示array1的内容
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        array2 = new int[array1.length];
        for (int i = 0;i<array2.length;i++){
            array2[i] = array1[i];

        }

        //修改array2中的偶索引元素，使其等于索引值
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0){
                array2[i] = i;
            }
        }
        //再次输出array1,原来的array1还是原来的。
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }

    }
}
