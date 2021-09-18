
/* Using an applet context, getCodeBase(),
 and showDocument() to display an HTML file.
*/
import java.awt.*;
import java.applet.*;
import java.net.*;

/*
<applet code="ACDemo" width=300 height=50>
</applet>
*/
public class ACDemo extends Applet {
    private static final long serialVersionUID = 1L;

    public void start() {
        AppletContext ac = getAppletContext();
        URL url = getCodeBase(); // get url of this applet
        try {
            ac.showDocument(new URL(url + "ACDemo.java"));
        } catch (Exception e) {
            showStatus("URL not found");
        }
    }
}