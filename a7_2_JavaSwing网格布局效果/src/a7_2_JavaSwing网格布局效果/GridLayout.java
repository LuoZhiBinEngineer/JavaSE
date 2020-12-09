package a7_2_JavaSwing网格布局效果;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class GridLayout extends JFrame{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GridLayout();
                frame.setVisible(true);
            }
        });
    }

    public GridLayout(){
        initializeComponents();
    }

    private void initializeComponents() {
        JPanel p1Buttons = new JPanel();
        p1Buttons.setLayout(new java.awt.GridLayout(4, 4));
        String[] names = {"7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".", "/", "="};
        for (int i = 0; i < names.length; i++) {
            p1Buttons.add(new JButton(names[i]));
        }
        this.add(p1Buttons);
        this.setTitle("网格布局演示");
        this.setSize(280,240);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
