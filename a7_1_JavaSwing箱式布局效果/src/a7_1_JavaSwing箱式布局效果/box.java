package a7_1_JavaSwing箱式布局效果;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")  //固定搭配（）
public class box extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new box();
                frame.setVisible(true); //显示窗口
            }
        });
    }

    public box() {
        initializeComponents();
    }

    private void initializeComponents() {
        Box vBox = Box.createHorizontalBox();
        {
            vBox.add(Box.createVerticalStrut(4));
            Box hBox = Box.createHorizontalBox();
            {
                hBox.add(Box.createHorizontalStrut(4));
                hBox.add(createCell());
                hBox.add(Box.createHorizontalStrut(4));
            }
            vBox.add(hBox);
            vBox.add(Box.createVerticalStrut(4));
        }

        this.add(vBox, BorderLayout.NORTH);
        this.setTitle("箱式布局演示");
        this.setSize(280, 240);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private Box createCell() {
        Box vBox = Box.createVerticalBox();
        {
            vBox.add(Box.createVerticalStrut(4));
            Box hBox = Box.createHorizontalBox();
            {
                hBox.add(Box.createHorizontalStrut(10));
                hBox.add(new JLabel("Score:000"));
                hBox.add(Box.createHorizontalGlue());
                hBox.add(new JButton("start"));
                hBox.add(Box.createHorizontalGlue());
                hBox.add(new JLabel("Time:000"));
                hBox.add(Box.createHorizontalStrut(10));
            }
            vBox.add(hBox);
            vBox.add(Box.createVerticalStrut(4));
        }
        vBox.setBorder(BorderFactory.createLoweredBevelBorder());
        return vBox;
    }
}
