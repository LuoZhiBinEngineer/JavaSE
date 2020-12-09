package a7_3_JScroPane滚动条面板;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

@SuppressWarnings("seral")
public class scroll extends JFrame{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {  //固定使用此格式创建窗口，保证性能最优化
            @Override
            public void run() {
                    JFrame frame = new scroll();
                    frame.setVisible(true);
                }
        });
    }

    public scroll(){
        initializeComponents();
    }

    private void initializeComponents(){
        JScrollPane spane = new JScrollPane(); //创建容器对象
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //垂直滚动条总是显示
        spane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //宽度超框时按需生成滚动条

        JTextArea txt = new JTextArea(); //多行为本组件
        spane.setViewportView(txt);  //为多行文本组件添加滚动支持

        this.add(spane);
        this.setTitle("滚动面板演示");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
