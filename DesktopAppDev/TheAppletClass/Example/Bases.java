
// Display code and document bases.
import java.awt.*;
import java.applet.*;
import java.net.*;

/*
<applet code="Bases" width=500 height=300>
</applet>
*/
public class Bases extends Applet {
    private static final long serialVersionUID = 1L;

    // Display code and document bases.
    public void paint(Graphics g) {
        setBackground(Color.orange);
        String msg;
        URL url = getCodeBase(); // get code base
        // D:\Projects\java\1-Introduction\23-TheAppletClass\Example\
        msg = "Code base: " + url.toString();
        g.drawString(msg, 10, 20);
        
        url = getDocumentBase(); // get document base
        // D:\Projects\java\1-Introduction\23-TheAppletClass\Example\Bases.java
        msg = "Document base: " + url.toString();
        g.drawString(msg, 10, 40);
    }
}