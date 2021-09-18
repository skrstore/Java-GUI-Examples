import java.applet.*;
import java.awt.Button;
// import java.awt.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

public class ButtonDemo extends Applet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() {
        Button b1 = new Button("Click Here");
        // b1.setBounds(150, 150, 50, 50);
        add(b1);
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(30, 30, 100, 100);
        g.fillRect(30, 150, 100, 100);
        // setLayout(new FlowLayout(FlowLayout.CENTER));
    }
}

/*
 * <applet code="ButtonDemo" width=400 height=400> </applet>
 */