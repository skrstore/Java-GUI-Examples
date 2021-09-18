import java.awt.*;
import java.applet.*;

// Applet Declaration
/*
<applet code="EmbddedAppletDeclaration" width=500 height=100>
</applet>
*/
public class EmbddedAppletDeclaration extends Applet {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        g.drawString("A Simple Applet, with Embdded Applet Declaration", 20, 20);
    }
}