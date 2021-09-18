import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class JScrollPaneDemo{
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("JScrollPane Deom");
        JPanel jp1 = new JPanel();
        
        jp1.setLayout(new GridLayout(20,20));
        int b = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                jp1.add(new JButton("Button" + b));
                b++;
            }
        }
        
        JScrollPane jsp1 = new JScrollPane(jp1);
        jf1.add(jsp1,BorderLayout.CENTER);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400,400);
        // jf1.setLayout(new FlowLayout());
        jf1.setVisible(true);
    }
}