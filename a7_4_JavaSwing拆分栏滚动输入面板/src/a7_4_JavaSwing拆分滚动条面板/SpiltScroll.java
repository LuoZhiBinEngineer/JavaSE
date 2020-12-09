package a7_4_JavaSwing拆分滚动条面板;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

@SuppressWarnings("serval")
public class SpiltScroll extends JFrame{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new SpiltScroll();
                frame.setVisible(true);
            }
        });
    }

    public SpiltScroll(){
        initializeComponents();
    }

    public void initializeComponents(){
        JScrollPane pane = new JScrollPane();

        JTextArea textLeft = new JTextArea();//创建左右输入文本框
        JTextArea textRight = new JTextArea();
        pane.setViewportView(textLeft);
        pane.setViewportView(textRight);

        JSplitPane sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pane,textLeft);//滚动面板嵌套到左边窗口
        JSplitPane sPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pane,textRight);
        sPane.setDividerLocation(100); //设置分隔条的位置
        sPane.setOneTouchExpandable(true);//设置可折叠箭头

        //此处的this可以省略(省略可能影响代码的可读性)
        this.add(sPane);
        this.add(sPane2);
        this.setTitle("拆分面板演示");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
