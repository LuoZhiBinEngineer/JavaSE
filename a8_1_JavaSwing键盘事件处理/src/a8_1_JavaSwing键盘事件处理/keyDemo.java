package a8_1_JavaSwing键盘事件处理;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serval")
public class keyDemo extends JFrame{
    private JLabel lbChar;
    private Random ran;
    private int sw,sh; //屏幕宽度和高度

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new keyDemo();
                frame.setVisible(true);
            }
        });
    }

    public keyDemo(){
        ran = new Random();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        sw = dim.width;
        sh = dim.height;
        initializeComponents();
    }

    //键盘事件处理，继承KeyAdapter，只处理KeyReleased方法
    private class KeyHandler extends KeyAdapter{
        @Override
        public void keyReleased(KeyEvent e){
            char ch = lbChar.getText().charAt(0);
            if (ch == e.getKeyCode()){
                midifyLabel();
            }
        }
    }

    private void initializeComponents(){
        this.setLayout(null); //使用绝对布局，才能指定随机位置

        lbChar = new JLabel();
        Font font = new Font("Times new roman",Font.BOLD,36);
        lbChar.setFont(font);
        lbChar.setSize(font.getSize(),font.getSize());
        midifyLabel();
        this.add(lbChar);

        this.setTitle("键盘练习程序");
        this.setExtendedState(MAXIMIZED_BOTH); //窗口最大化
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addKeyListener(new KeyHandler());
    }

    private void midifyLabel(){
        char ch = (char)(ran.nextInt(26)+0x41); //随机产生大写字母
        lbChar.setText(String.valueOf(ch));
        Font font = lbChar.getFont();
        //保证在窗口内出现
        lbChar.setLocation(ran.nextInt(sw - font.getSize()),ran.nextInt(sh - font.getSize() - 30));
    }
}
