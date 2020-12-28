package 数组的反转;

/*
 *  数组算法的考察：复制、反转、查找（线性查找、二分法查找）
 *
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
        //对换的次数很重要，属于中位的不动，只需要对换数组长度一半即可
            //方法一：
        for (int i = 0; i <= arr1.length / 2; i++) {
            String temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        }
            //方法二：
        /*
        for(int i = 0,j = arr1.length - 1;i < j;i++,j--) {
            String temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }
        */
        //遍历输出反转后的数组
        for (int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }
    }
}
