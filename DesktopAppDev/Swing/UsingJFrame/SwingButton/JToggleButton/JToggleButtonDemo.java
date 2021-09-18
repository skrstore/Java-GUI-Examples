import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

class JToggleButtonDemo {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("ToggleButton Demo");
        JToggleButton jtb1 = new JToggleButton("OFF");

        jtb1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jtb1.isSelected()) {
                    jtb1.setText("ON");
                } else {
                    jtb1.setText("OFF");
                }
            }
        });

        jf1.add(jtb1);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400, 400);
        jf1.setLayout(new FlowLayout());
        jf1.setVisible(true);
    }
}