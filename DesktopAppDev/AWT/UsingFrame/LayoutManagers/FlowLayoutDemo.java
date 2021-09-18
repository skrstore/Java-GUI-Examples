import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

class FlowLayoutDemo{
    public static void main(String[] args) {
        Frame f1 = new Frame("Flow Layout Demo");

        f1.add(new Button("Click Here"));
        f1.add(new Label("This is a label in JAVA."));

        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f1.setVisible(true);
    }
}