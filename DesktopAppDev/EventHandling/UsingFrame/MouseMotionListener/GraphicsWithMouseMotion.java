import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

// ::::::::::: Not Working ::::::::::::::

class GraphicsWithMouseMOtion {
    public static void main(String[] args) {
        Frame f1 = new Frame("Graphics With MouseMotion");

        f1.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseMoved(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g1 = getGraphics();
                g1.setColor(Color.ORANGE);
                g1.fillOval(e.getX(), e.getY(), 20, 20);
            }
        });
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}