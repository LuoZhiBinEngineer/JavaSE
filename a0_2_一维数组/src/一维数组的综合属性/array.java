package 一维数组的综合属性;
/*
*   1.一维数组的使用
*   ①一维数组的声明和初始化
*   ②如何调用数组的指定位置的元素
*   ③如何获取数组的长度
*   ④如何遍历数组
*   ⑤数组元素的默认初始化值 /见Normal.java
*   ⑥数组的内存解析
*
*   2.①一位数组的声明和初始化
*   正前方式：
*   int num; //声明
*   num = 10; //初始化
*   int id=1001; //声明和初始化
*
*   int[] ids; //声明
*   //静态初始化：数组的初始化和数组元素的赋值操作同时进行
*   ids = new int[] = {1001,1002,1003};
*   标准:int[] ids = new int[]{1,2,3};
*   //动态初始化：数组的初始化和数组的赋值操作分开进行
*   String[] names = new String[5];
*
*   int array[4] = {1,2,3,4,5}; //类型推断
*
*   ②调用数组指定位置的元素
*   通过数组的角标进行调用数组的元素（即[]内的数字）
*   数组的角标（或索引）从0开始的，到数组的长度-1结束。
*
*   ③获取数组的长度：System.out.println("数组的长度为："+names.length);
*
*
 */
public class array {
    public static void main(String[] args) {

        String[] names = new String[5]; //开辟数组存储空间

        names[0] = "成龙";
        names[1] = "洪金宝";
        names[2] = "元彪";
        names[3] = "张曼玉";
        names[4] = "元华"; //charAt(0)
        //数组定位输出
        System.out.println(names[1]);
        //获取数组的长度length
        System.out.println("数组的长度为："+names.length);
        //遍历数组内的元素
        for (int i = 0;i < names.length;i++) {
            System.out.println(names[i]);
        }
        //

    }
}
