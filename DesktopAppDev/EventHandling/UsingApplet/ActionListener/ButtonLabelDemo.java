import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonLabelDemo extends Applet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() {
        Button b1 = new Button("Click Here");
        Label l1 = new Label("Action Performed");
        add(b1);
        add(l1);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Mouse Clicked");
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}

/*
 * <applet code="ButtonLabelDemo" width=400 height=400> </applet>
 */