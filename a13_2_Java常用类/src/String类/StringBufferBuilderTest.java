package String类;

import org.junit.Test;

public class StringBufferBuilderTest {

    @Test
    public void test1() {
        StringBuffer sb2 = new StringBuffer("abc");
        sb2.append('1');
        sb2.append(1);
        System.out.println(sb2);
//        sb2.replace(2,4,"hello");
//        sb2.insert(2,false);
        sb2.reverse();
        System.out.println(sb2);
    }

    @Test
    public void test(){
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.length());
    }
}
