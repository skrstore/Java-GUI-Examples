import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

class LabelDemo {
    public static void main(String[] args) {
        Frame f1 = new Frame("Label Example");
        Label l1 = new Label("This is First Label");

        l1.setBounds(100, 50, 200, 100);
        l1.setBackground(Color.CYAN);
        
        f1.add(l1);
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}