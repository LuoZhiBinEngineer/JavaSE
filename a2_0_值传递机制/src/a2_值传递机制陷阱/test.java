package a2_值传递机制陷阱;

public class test {
    public static void main(String[] args) {
        test s = new test();
        String s1 = "hello";
        s.change(s1);
        System.out.println(s1);
    }
    public void change(String s){
        s = "hi!";
    }
}
