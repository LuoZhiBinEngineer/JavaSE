package YangHui;

/*
 *   1.第一行有一个元素，第n行有n个元素
 *   2.每一行的第一个元素和最后一个元素都为1
 *   3.从第三行开始，对于非第一个元素和最后一个元素的元素。即：
 *   yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 */

public class yanghuitest {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];
        //给二维数组的元素赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];

            //定好数组首尾元素为1
            yanghui[i][0] = yanghui[i][i] = 1;

            //给其他元素赋值,for循环中的j=1和length-1自动筛选掉了开头两行
            for (int j = 1; j < yanghui[i].length - 1; j++) {//从第一个元素开始到倒数第二个元素
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
            }
        }
        //遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
