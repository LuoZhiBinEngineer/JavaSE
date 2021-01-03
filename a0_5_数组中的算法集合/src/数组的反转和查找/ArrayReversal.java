package 数组的反转和查找;

/*
 *  数组算法的考察：复制、反转、查找（线性查找、二分法查找）
 *
 */
public class ArrayReversal {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA"};
        //数组的复制
        String[] arr2 = new String[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();

        //数组的反转
        //对换的次数很重要，位于中位的元素不动，只需要对换数组长度一半即可
        //方法一：
        for (int i = 0; i <= arr1.length / 2; i++) {
            String temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];//首尾对换，然后第二个与倒数第二个对换...
            arr1[arr1.length - i - 1] = temp;
        }
        //方法二：
        /*
        i,j分别代表头和尾，对换方式和方法一相同。
        for(int i = 0,j = arr1.length - 1;i < j;i++,j--) {
            String temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }
        */
        //遍历输出反转后的数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();

        //查找(线性查找、二分法查找)
        //线性查找
        boolean isFlag = true;
        String dest = "LL"; //要查找的元素
        for (int i = 0; i < arr1.length; i++) {
            if (dest.equals(arr1[i])) {
                System.out.print("找到了指定的元素，位置为：" + i);
                isFlag = false;
                break;
            }
        }
        //方法一：
        if (isFlag) {
            System.out.print("很遗憾没有找到哦！");
        }
        /*
        方法二：因为在for循环内已经找完了一遍length了，所以跳出循环开始执行后面的内容
        可以直接使用 if(i == arr1.length){
                        System.out.print("很遗憾没有找到的啦!")
         */
        System.out.println();

        //二分查找法
        //前提：所查找的数组必须有序
        int[] array2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int dest1 = -35;
        int head = 0;//初始的首位置
        int end = array2.length - 1;//初始的末位置
        boolean isFlag1 = true;
        while (head <= end){
            int middle = (head + end) / 2;
            if (dest1 == array2[middle]){
                System.out.println("找到了指定位置的元素，位置为："+middle);
                isFlag1 = false;
                break;
            }else if (array2[middle] > dest1){
                end = middle -1;
            }else {
                head = middle +1;
            }
        }
        if (isFlag1){
            System.out.println("很遗憾，没有找到的啦！");
        }
    }
}
