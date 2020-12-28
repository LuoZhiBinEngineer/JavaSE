package 求数值型数组元素的MaxMinAverageSummation;

/*
 *  算法的考察：求数值型数组元素的最大值、最小值、平均数和总和等。
 *
 *  要求：定义一个int型数组，包含10个元素，分别赋予随机整数，
 *  然后输出所有元素的最大值、最小值、平均值和总和。
 *
 *  要求：所有的随机数都是两位数。
 *
 *  随机数:
 * `范围[10,99]
 *  公式：(int)(Math.random() * (99 - 10 + 1) + 10)
 */

public class Evaluationoperation {
    public static void main(String[] args) {
        //方法第一行代码
        long startTime = System.currentTimeMillis();

        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
        //遍历数组
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

/*详细易懂的代码，重在理解*/
        //求最大值
        int MaxValue = array1[0];//注意：这里的值不能为0(下同)，因为如果数组中的数存在或都为负数，则结果会有偏差或总为0。
        for (int i = 1; i < array1.length; i++) {
            if (MaxValue < array1[i]) {
                MaxValue = array1[i];
            }
        }
        System.out.println("该数组元素的最大值是：" + MaxValue);

        //求最小值
        int MinValue = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (MinValue > array1[i]) {
                MinValue = array1[i];
            }
        }
        System.out.println("该数组元素的最小值是：" + MinValue);

        //求总和
        int Sum = 0;
        for (int i = 0; i < array1.length; i++) {
            Sum += array1[i];
        }
        System.out.println("该数组的总和是：" + Sum);

        //求平均数
        System.out.println("该数组的平均值是："+Sum/ array1.length);

/*优化后的代码*/
//        int MaxValue = array1[0];
//        int MinValue = array1[0];
//        int Sum = 0;
//        for (int i = 0; i < array1.length; i++) {
//            if (MaxValue < array1[i]) {
//                MaxValue = array1[i];
//            }
//            if (MinValue > array1[i]) {
//                MinValue = array1[i];
//            }
//            Sum += array1[i];
//        }
//        System.out.println("该数组元素的最大值是：" + MaxValue);
//        System.out.println("该数组元素的最小值是：" + MinValue);
//        System.out.println("该数组的总和是：" + Sum);
//        System.out.println("该数组的平均值是：" + Sum / array1.length);


/*可以尝试比对两个代码的执行效率如何*/
        //方法最后一行代码
        long endTime = System.currentTimeMillis();
        //long类型时间差，单位毫秒
        long timeLong = endTime - startTime;
        //long类型时间差转为double类型时间差，单位毫秒
        double timeDouble= Double.parseDouble(Long.toString(timeLong));
        System.out.println("该方法执行时间为" + timeDouble+ "毫秒，即" + timeDouble/(double)1000 + "秒");
    }
}
