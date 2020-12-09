package b1_钱的运算器;

import java.util.Scanner;

public class cnm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x,y;
        while(true) {
            Money Q1 = new Money();
            Money Q2 = new Money();
            Money Q3 = new Money();
            System.out.println("1.钱的加法");
            System.out.println("2.钱的减法");
            System.out.println("3.钱的翻倍");
            System.out.println("4.钱的比较");
            System.out.println("请输入要进行的运算方法：");
            String m = sc.next();
            System.out.println("请输入第一个钱：");
            Q1.setHo(sc.nextFloat());
            if(m.equals("3")) {System.out.print("请输入要翻的倍数");
            }else {
                System.out.println("请输入第二个钱：");
                Q2.setHo(sc.nextFloat());}
            switch(m) {
                case "1":{float a = Q1.add(Q1.getHo(),Q2.getHo());Q3.format(a);break;}
                case "2":{float a = Q1.sub(Q1.getHo(),Q2.getHo());Q3.format(a);break;}
                case "3":{float a = Q1.dou(Q1.getHo(),sc.nextInt());Q3.format(a);break;}
                case "4":{float a = Q1.com(Q1.getHo(),Q2.getHo());Q3.format(a);break;}
            }
        }
    }
}
