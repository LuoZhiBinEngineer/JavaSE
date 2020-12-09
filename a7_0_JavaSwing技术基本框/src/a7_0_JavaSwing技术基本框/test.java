package a7_0_JavaSwing技术基本框;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class test {
    public static void main(String[] args) {
        //此方法功能是将事件对象加入EDT的实践队列中等待执行，而方法本身并不会阻塞线程立即返回
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new practice();
                frame.setVisible(true); //setVisible方法的作用是显示窗口
            }
        });
    }
}
