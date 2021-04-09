package enum关键字;

/*
 *  使用enum关键字定义枚举类
 *  说明：定义的枚举类默认继承于java.lang.Enum类
 *  如果重写toString方法则不再使用默认的Enum提供的方法
 */
public class enumTest {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        //toString()：
        System.out.println(spring.toString());
        System.out.println("*********");
        //values()：
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        System.out.println("*********");
        //查询线程的所有状态
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }
        System.out.println("*********");
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
    }
}


interface showWhether{
    void show();
}
//使用enum关键字枚举类
enum Season1 implements showWhether{
    //1.提供当前枚举类的对象，多个对象之间用“,”隔开，末尾对象“;”结束
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("11111");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("2222");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("3333");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("4444");
        }
    };


    //2.声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有化类的构造器，并给对象属性赋值
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //5.其他诉求1：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //其他诉求2：
//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}