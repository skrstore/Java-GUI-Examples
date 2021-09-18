import java.applet.*;
import java.awt.*;

public class HelloApplet extends Applet {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        g.drawString("Hello World of Java Applet.", 40, 20);
        g.drawOval(50, 50, 50, 50);
    }
}