import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

class BorderLayoutDemo{
    public static void main(String[] args) {
        Frame f1 = new Frame();
        f1.setLayout(new BorderLayout());

        f1.add(new Button("Center"),BorderLayout.CENTER);
        f1.add(new Button("North"),BorderLayout.NORTH);
        f1.add(new Button("South"),BorderLayout.SOUTH);
        f1.add(new Button("East"),BorderLayout.EAST);
        f1.add(new Button("West"),BorderLayout.WEST);
        f1.add(new Button("Before First Line"),BorderLayout.BEFORE_FIRST_LINE);
        f1.add(new Button("Line Start"),BorderLayout.LINE_START);

        f1.setSize(400, 400);
        f1.setVisible(true);
    }
}