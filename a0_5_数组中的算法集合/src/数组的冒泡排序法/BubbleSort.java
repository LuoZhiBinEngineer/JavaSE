package 数组的冒泡排序法;
/*
*   冒泡排序的基本思想：通过对待排序序列从前往后，依次比较相邻元素的排序码，
*       若发现逆序则交换，使排序码较大的元素逐渐从前部移向后部。
*       通过【多次】的比较后移，将大数移向后部。
*   因为排序的过程中，各元素不断接近自己的位置，如果一趟比较下来没有进行过交换，
*       就说明序列有序，因此要在排序过程中设置一个标志swap判断元素是否进行过交换，
*       从而减少不必要的比较。
*
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};

        for (int i = 0;i < arr.length - 1;i++){//大轮一次，小轮一遍。
            for (int j = 0;j < arr.length - 1 - i;j++){//小轮一遍，大轮一次。
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}