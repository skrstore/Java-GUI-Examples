import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Insets;

// :::::::::: NOT COMPLETE :::::::::::::::::::::::::::::::

class FlowLayoutWithInsets {
    public static void main(String[] args) {
        Frame f1 = new Frame("Flowlayout With Insets");
        f1.setLayout(new BorderLayout());

        f1.add(new Button("Click Here"), BorderLayout.CENTER);

        f1.setBackground(Color.PINK);
        f1.setSize(400, 400);
        // f1.setLayout(new FlowLayout(FlowLayout.LEFT));
        f1.setVisible(true);
    }

    public Insets getInsets() {
        return new Insets(50, 50, 10, 10);
    }
}
