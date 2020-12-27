package A求职笔试题之数组随机赋值;

/*
 *  创建一个长度为6的in型数组，要求数组元素的值都在1-30之间，且都是随机赋值。
 *  同时，要求元素的值各不相同（最好考虑最佳性能和最短时间）。
 */

public class pantest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) + 1; //随机给数组中的元素赋值，范围是30以内

            for (int j = 0; j < i; j++) {//比对全部检查是否有相同的数值
                if (arr[i] == arr[j]) {
                    i--; //相同的话就i-1，重新开始赋值，后再比对
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) { //遍历输出数组内的元素
            System.out.print(arr[i] + " ");
        }
    }
}
