package 数组的内存解析;

public class ArrayMemoryResolution {
    public static void main(String[] args) {
        Student[] arr1 = new Student[5];
        arr1[0] = new Student();
        System.out.println(arr1[0]);//输出地址值
        System.out.println(arr1[1].number);//没有给他赋值，报错异常！空指针
    }
}
class Student{
    int number;
}
