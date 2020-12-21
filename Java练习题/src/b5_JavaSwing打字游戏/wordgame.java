package b5_JavaSwing打字游戏;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class wordgame extends JFrame {    //继承JFrame顶层框架

    //定义面板
    JPanel jp1;
    JPanel jp2;
    JPanel jp3;
    JSplitPane jsp;//定义拆分窗格
    //定义文本域
    JTextArea jta1;
    TextField jta2;
    //定义滚动窗格
    JScrollPane jspane1;
    JScrollPane jspane2;
    //定义按钮
    JButton jb2;
    JButton jb3;
    //定义显示区域
    JLabel jla1;
    //定义随机函数
    Random ran;
    private int sw;  //屏幕宽度和高度
    private int sh;  //屏幕宽度和高度
    private String ch;//随机单词

    public static void main(String[] args) {
        wordgame a= new wordgame();    //显示界面
    }

    public wordgame(){//构造函数
        //字体初始化 Times new roman：罗马字样 加粗
        Font font = new Font("", Font.BOLD, 50);
        Font font2 = new Font("Times new roman", Font.BOLD, 30);
        ran = new Random();
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        //创建多行文本框
        jta1 = new JTextArea();
        jta1.setText("单词打字游戏,请在右边输入单词→→→→→→→→");
        jta2 = new TextField(10);//创建单行文本框
        jta1.setLineWrap(true); //设置多行文本框自动换行
        jspane1 = new JScrollPane(jta1);
        jspane2 = new JScrollPane(jta2);
        jta2.setFont(font2);
        jta1.setFont(font);
        //创建拆分窗格
//      jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jspane1, jspane2);//设置上下分频器
        jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jspane1,jspane2);//设置左右分频器
        //分频器布局
        jsp.setDividerLocation(1200);        //设置拆分窗格分频器初始位置
        jsp.setDividerSize(40);             //设置分频器宽度大小
        //设置调整单词显示区
        jla1 = new JLabel();
        jla1.setFont(font);
        //初始化显示页面
        ch = RandomWords();
        jla1.setText(ch);
        jla1.setSize(sw, sh);
        jla1.setSize(500, 500);
        jla1.setLocation(ran.nextInt(300), ran.nextInt(200));
        jla1.setForeground(Color.green); //设置颜色
        //创建按钮
        jb2 = new JButton("确定");
        jb3 = new JButton("退出");
        //设置布局管理
        jp1.setLayout(new BorderLayout());
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp3.setLayout(new BorderLayout());
        //添加组件
        jp1.add(jsp);
        jp2.add(jb2);
        jp2.add(jb3);
        jta1.add(jla1);
        //布置整体面板布局
        this.add(jp1, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);
        this.add(jp3, BorderLayout.WEST);
        //设置窗体属性
        this.setTitle("打字游戏");
        this.setExtendedState(MAXIMIZED_BOTH);                      //窗口最大化
        this.setLocation(1000, 200);                           //设置界面初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //设置虚拟机和界面一同关闭
        this.setVisible(true);

        //空格加鼠标确定事件监听
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jta2.getText().equals(ch)) {
                    Correctanswer();
                }else {
                    jla1.setForeground(Color.red);
                    Wronganswer();
                }
            }
        });

        //退出按钮事件监听
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    //随机产生单词
    private String RandomWords() {
        String[] s = {"shift", "fire", "link", "community", "program", "files", "idea", "teachers",
                "java", "library", "good", "brains", "edition", "happy", "fuck", "finish",
                "culture", "china", "fly", "lying","optimistic","content","red","zoom","lady"};
        int b = ran.nextInt(21);//定义随机数区间[0,20]
        return s[b];
    }

    //获取用户屏幕大小
    private void SimpleFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        sw = dim.width;
        sh = dim.height;
    }

    //回答正确
    private void Correctanswer(){

        //改变颜色
        jla1.setForeground(Color.CYAN);

        //产生单词
        ch = RandomWords();
        jla1.setText(ch);

        //更改位置
        jla1.setLocation(ran.nextInt(700), ran.nextInt(300));
    }

    //回答错误
    private void Wronganswer(){
        //改变颜色
        jla1.setForeground(Color.red);

    }

    //重置按钮
    private void Reset(){

        //初始化文本
        ch=RandomWords();
        jla1.setText(ch);
        jta1.setText("重新开始，继续努力");
        jta2.setText("");
        jta1.setForeground(Color.CYAN);
        jla1.setForeground(Color.green);

    }
}
