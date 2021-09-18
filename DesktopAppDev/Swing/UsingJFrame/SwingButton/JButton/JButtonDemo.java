import java.awt.FlowLayout;

import javax.swing.*;

class JButtonDemo {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("Button Demo");
        // JButton With Text
        JButton jb1 = new JButton("Click Here");
        // JButton With Image
        JButton jb2 = new JButton(new ImageIcon("../../images/smile.png"));

        JButton jb3 = new JButton("Click Here",new ImageIcon("../../images/smile.png"));

        jf1.add(jb1);
        jf1.add(jb2);
        jf1.add(jb3);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400, 400);
        jf1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jf1.setVisible(true);
    }
}