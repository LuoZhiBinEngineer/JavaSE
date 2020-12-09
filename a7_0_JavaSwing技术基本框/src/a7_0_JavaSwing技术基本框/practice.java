package a7_0_JavaSwing技术基本框;

import javax.swing.JFrame; //JFrame中集成了拖曳窗口、调整大小、最小化、最大化、关闭等功能
import java.awt.Color;
@SuppressWarnings("serial")
class practice extends JFrame{
    public practice(){
        initializeComponents(); //组件初始化
    }
    public void initializeComponents() {
        this.setTitle("基本窗口"); //设置窗口标题
        this.setSize(400, 300); //设置窗口大小（宽，高）
        this.setBackground(Color.RED);
        this.setLocationRelativeTo(null); //设置在父容器中居中显示
        //单击关闭按钮时执行System.exit方法退出程序
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //单击关闭按钮时不执行任何操作，要关闭窗口做处理时需要使用，如弹出（“是否需要保存”）
//      this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //单击关闭按钮时只是隐藏窗体（可以重新显示），程序并未关闭，是JFrame的默认行为
//      this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        //单击关闭按钮时窗口消失并释放窗体占用的系统资源，不能再重新显示，程序也不关闭
//      this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
