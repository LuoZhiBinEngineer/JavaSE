public class Time {
    public static void main(String[] args) {
        //获取代码执行前的系统时间
        long startTime = System.currentTimeMillis();

        /*检测的内容代码区*/
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }



        //获取代码执行结束后的系统时间
        long endTime = System.currentTimeMillis();
        //long类型计算时间差，单位毫秒
        long timeLong = endTime - startTime;
        //long类型时间差转为double类型时间差，单位毫秒
        double timeDouble= Double.parseDouble(Long.toString(timeLong));
        System.out.println("该方法执行时间为" + timeDouble+ "毫秒，即" + timeDouble/(double)1000 + "秒");
    }

}
