import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class JAppletDemo extends JApplet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() {
        makeApplet();
    }

    private void makeApplet() {
        setLayout(new FlowLayout());
        JButton jb1 = new JButton("click Here");
        JLabel jl1 = new JLabel("Click The Button");

        add(jb1);
        add(jl1);
    }
}

/*
 * <applet code="JAppletDemo" width=400 height=400> </applet>
 */