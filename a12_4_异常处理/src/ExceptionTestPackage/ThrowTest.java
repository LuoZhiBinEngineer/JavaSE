package ExceptionTestPackage;

public class ThrowTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.regist(-1000);
        System.out.println(s);
    }
}
class Student{
    private int id;

    public void regist(int id){
        if (id > 0){
            this.id = id;
        }else {
//            System.out.println("您输入的数据非法！");
            throw new RuntimeException("您输入的数据非法！");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
