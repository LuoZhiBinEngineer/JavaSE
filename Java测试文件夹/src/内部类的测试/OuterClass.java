package 内部类的测试;

public class OuterClass {
    private String language = "看看能不能访问";
    private String region = "是不是可以啊！";


    public class InnerClass {
        public void printOuterClassPrivateFields() {
            String fields = "language=" + language + ";region=" + region;
            System.out.println(fields);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printOuterClassPrivateFields();
    }
}
