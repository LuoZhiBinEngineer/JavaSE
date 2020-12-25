package 求职笔试题1;

/*
 *  创建一个长度为6的in型数组，要求数组元素的值都在1-30之间，且都是随机赋值。
 *  同时，要求元素的值各不相同（最好考虑最佳性能和最短时间）。
 */

public class pantest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
