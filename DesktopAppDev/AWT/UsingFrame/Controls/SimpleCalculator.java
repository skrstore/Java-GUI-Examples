import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalculator {
    // Declaration of all variables
    static Frame f1 = new Frame();
    static TextField tf1 = new TextField();
    static TextField tf2 = new TextField();
    static TextField tf3 = new TextField();
    static Font fn1 = new Font("Monospace", Font.BOLD, 20);
    static Button b1 = new Button("+");
    static Button b2 = new Button("-");

    public static void main(String[] args) {
        // TextField Setting
        tf1.setBounds(100, 100, 80, 30);
        tf1.setFont(fn1);
        tf2.setBounds(200, 100, 80, 30);
        tf2.setFont(fn1);
        tf3.setBounds(150, 150, 80, 30);
        tf3.setFont(fn1);
        tf3.setEditable(false);
        tf3.setEnabled(false);
        // Button b1 Setting
        b1.setBounds(100, 200, 50, 50);
        b1.setFont(fn1);
        b1.setBackground(Color.LIGHT_GRAY);
        // Adding the Action and Action Listener
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int n3 = getRes(e);
                String res = String.valueOf(n3);
                tf3.setText(res);
            }
        });
        // Button b2 Setting
        b2.setBounds(250, 200, 50, 50);
        b2.setFont(fn1);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int n3 = getRes(e);
                String res = String.valueOf(n3);
                tf3.setText(res);
            }
        });
        // Frame f1 Setting
        f1.add(tf1);
        f1.add(tf2);
        f1.add(tf3);
        f1.add(b1);
        f1.add(b2);
        f1.setBackground(Color.BLUE);
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }

    // Method to get the Result (Addition And Substraction)
    static int getRes(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = 0;
        if (e.getSource() == b1) {
            n3 = n1 + n2;
        } else if (e.getSource() == b2) {
            n3 = n1 - n2;
        }
        return n3;
    }
}