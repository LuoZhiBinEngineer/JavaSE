package 课后练习题;

import java.util.Scanner;

/*
 *   先输入学生人数，根据人数创建int数组存放学生成绩
 *   从键盘输入学生成绩，找出最高分，并输出学生成绩等级。
 *   1.成绩>=最高分-10 等级为'A'
 *   2.成绩>=最高分-20 等级为'B'
 *   3.成绩>=最高分-30 等级为'C'
 *   4.成绩>=最高分-40 等级为'D'
 */

public class practiceArray2 {
    public static void main(String[] args) {
        int maxScore = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的人数");
        int number = sc.nextInt();
        //创建数组
        int[] Score = new int[number];
        System.out.println("请输入" + number + "个成绩");
        //给数组赋值
        for (int i = 0; i < Score.length; i++) {
            Score[i] = sc.nextInt();
            if (maxScore < Score[i]) {
                maxScore = Score[i];
            }
        }
        //计算学生成绩的等级
        char level;
        for (int i = 0; i < Score.length; i++) {
            if (maxScore - Score[i] <= 10) {
                level = 'A';
            } else if (maxScore - Score[i] <= 20) {
                level = 'B';
            } else if (maxScore - Score[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("Student " + i + " Score is " +
                    Score[i]+" Grade Level is " + level);
        }
    }
}
