package 二分查找法;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {21, 45, 61, 65, 72, 83, 85, 90, 95};
        int index = find(a, 60);
        System.out.println("该元素的索引位置为：" + index);
    }

    public static int find(int[] a, int value) {
        int index = -1;
        int left = 0, right = a.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1; //无符号右移代替除2（÷2）操作
            if (a[mid] == value) {
                index = mid;
                break;
            }
            if (a[mid] > value)
                right = mid - 1;
            else
                left = mid - 1;
        }
            return index;

    }
}

