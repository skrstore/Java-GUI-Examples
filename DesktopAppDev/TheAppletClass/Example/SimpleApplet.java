import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {
    private static final long serialVersionUID = 1L;

    public void init() {
        setBackground(Color.YELLOW);
        setForeground(Color.YELLOW);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 23));
        g.drawString("Welcome", 50, 50);
        g.drawLine(20, 30, 20, 300);
        g.drawRect(70, 100, 30, 30);
        g.fillRect(170, 100, 30, 30);
        g.drawOval(70, 200, 30, 30);

        g.setColor(Color.darkGray);
        g.fillOval(170, 200, 30, 30);
        g.drawArc(90, 150, 30, 30, 0, 90);
        g.fillArc(270, 150, 30, 30, 0, 180);
    }
}

/*
 * <applet code="SimpleApplet.class" width="300" height="300"> </applet>
 */