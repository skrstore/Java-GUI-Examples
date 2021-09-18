import java.applet.*;
import java.awt.*;

public class SmileApplet extends Applet {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        // main circle
        g.setColor(Color.orange);
        g.fillOval(30, 30, 300, 300);
        // eye
        g.setColor(Color.black);
        g.fillOval(100, 90, 45, 60);
        g.fillOval(220, 90, 45, 60);
        // smile
        g.setColor(Color.black);
        g.fillArc(70, 110, 220, 190, 180, 180);
        g.setColor(Color.orange);
        g.fillArc(80, 110, 200, 180, 180, 180);
    }
}

/*
 * <applet code="SmileApplet" height='500' width="500"> </applet>
 */