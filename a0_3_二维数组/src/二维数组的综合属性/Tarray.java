package 二维数组的综合属性;

/*
 *   一、
 *      1.二维数组实质上是一个矩阵
 *      2.定义二维数组时，[][]可放在类型后，也可放在数组名后，如int[][] arr 或int arr[][] 或int[] arr[]
 *      3.类型推断：省略new int[][],即int[][] arr = {{1,2,3},{4,5}};根据=前面的类型推断
 *      4.二维数组可以当做一维数组，[][]第一个框内即是数组的长度。可以看成每个一维数组元素内还有一个数组：
 *      {外数组1{内数组1,内数组2},外数组2{内数组1,内数组2}}
 */
public class Tarray {
    public static void main(String[] args) {
        //二维数组的静态初始化
        int[][] array = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        //二维数组的动态初始化
        String[][] array1 = new String[3][2];
        String[][] array2 = new String[3][];
        /*错误的情况 int[3][4] array = new int[][];
        int[][] array1 = new int[][3];
        int[][] array2 = new int[4][3]{{1,2,3},{4,5},{6,7,8}};
         */

        //调用数组指定位置的元素
        System.out.println(array[0][2]);
        System.out.println(array1[1][1]);
        System.out.println("*****************");
        array2[1] = new String[4];
        System.out.println(array2[1][0]);

        //获取二维数组的长度
        System.out.println(array1.length);
        System.out.println(array[1].length);//可以精确到数组内的数组元素个数
        System.out.println(array[2].length);

        //二维数组的遍历
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
