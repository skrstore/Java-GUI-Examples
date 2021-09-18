
/* A simple banner applet.
 This applet creates a thread that scrolls
 the message contained in msg right to left
 across the applet’s window.
*/
import java.awt.*;
import java.applet.*;

/*
<applet code="SimpleBanner" width=300 height=300>
</applet>
*/
public class SimpleBanner extends Applet implements Runnable {
    private static final long serialVersionUID = 1L;
    String msg = " A Simple Moving Banner.";
    Thread t = null;
    volatile boolean stopFlag;

    // Set colors and initialize thread.
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    // Start thread
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    // Entry point for the thread that runs the banner.
    public void run() {
        // Redisplay banner
        for (;;) {
            try {
                repaint();
                Thread.sleep(1000);
                if (stopFlag)
                    break;
            } catch (InterruptedException e) {
            }
        }
    }

    // Pause the banner.
    public void stop() {
        stopFlag = true;
        t = null;
    }

    // Display the banner.
    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 100, 30);

        String a = Integer.toString(msg.length());
        String b = Character.toString(msg.charAt(0));
        g.drawString(a, 10, 60);
        g.drawString(b, 10, 90);
    }
}