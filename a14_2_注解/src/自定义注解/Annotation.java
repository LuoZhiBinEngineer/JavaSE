package 自定义注解;

public class Annotation {
    public static void main(String[] args) {

    }
}
class UseAnnotation{
    int age;
    String name;

//    @MyAnnotation(value = "hi~")
    //JDK8之前重复注解的写法：
//    @MyAnnotations({@MyAnnotation(value = "hi~"),@MyAnnotation(value = "abc")})
    //JDK8之前重复注解的写法：
    @MyAnnotation(value = "hi~")
    @MyAnnotation(value = "abc")
    public void tryAnnotation(){
        System.out.println("hello");
    }
}
