import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class LabelWithMouseListener {
    public static void main(String[] args) {
        Frame f1 = new Frame("Label With Mouse Listener");
        Label l1 = new Label("No Action Performed");
        l1.setBackground(Color.ORANGE);
        l1.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                l1.setText("Mouse Released");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                l1.setText("Mouse Pressed");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l1.setText("Mouse Exited");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("Mouse Entered");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("Mouse Clicked");
            }
        });

        f1.add(l1);
        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f1.setVisible(true);
    }
}