import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("JCoboBoxDemo");
        String[] content = { "Apple", "Banana", "Mango", "Orange" };
        JComboBox jcb1 = new JComboBox<>(content);

        jf1.add(jcb1);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400, 400);
        jf1.setLayout(new FlowLayout());
        jf1.setVisible(true);
    }
}