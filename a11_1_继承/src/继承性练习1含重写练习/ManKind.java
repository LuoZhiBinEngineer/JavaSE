package 继承性练习1含重写练习;

/*
 *  定义一个ManKind类，包括成员变量int sex,salary；
 *  方法void manOrWoman()：根据sex的值显示"man"(sex==1)或者"woman"(sex==0)；
 *  方法void employeed()；根据salary的值显示"no job"(salary==0)或者"job"(salary!=0)。
 *
 */
public class ManKind {
    private int sex;//性别
    private int salary;//薪资

    public ManKind() {

    }

    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }
    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("Man");
        } else if (sex == 0) {
            System.out.println("Woman");
        }
    }

    public void employeed() {
        //方法一：
//        String jobInfor = (salary == 0) ? "No Job" : "Job";
//        System.out.println(jobInfor);
        //方法二：
        if (salary == 0) {
            System.out.println("No Job");
        } else {
            System.out.println("Job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
