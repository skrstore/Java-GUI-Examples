import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JButtonWithActionListener {
    static int a = 0;

    public static void main(String[] args) {
        JFrame jf1 = new JFrame("Frame With ActionListener");
        JLabel jl1 = new JLabel("No Action Performed");
        JButton jb1 = new JButton("Click Here");

        jl1.setBounds(50, 50, 200, 100);
        jb1.setBounds(50, 150, 150, 50);
        jb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                a += 1;
                jl1.setText("Button Clicked : " + a + " times");
            }
        });

        jf1.add(jl1);
        jf1.add(jb1);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400, 400);
        jf1.setLayout(null);
        jf1.setVisible(true);
    }
}