import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class TextAreaWithKeyListener{
    public static void main(String[] args) {
        Frame f1 = new Frame();
        TextArea ta1 = new TextArea();
        Label l1 = new Label("No Action Performed");

        l1.setBounds(30, 30, 200, 50);
        l1.setBackground(Color.LIGHT_GRAY);
        ta1.setBounds(30, 100, 200, 200);
        ta1.setBackground(Color.MAGENTA);
        ta1.addKeyListener(new KeyListener(){
        
            @Override
            public void keyTyped(KeyEvent e) {
                l1.setText("Key Typed");
            }
        
            @Override
            public void keyReleased(KeyEvent e) {
                l1.setText("Key Released");
            }
        
            @Override
            public void keyPressed(KeyEvent e) {
                l1.setText("Key Pressed");
            }
        });

        f1.add(l1);
        f1.add(ta1);

        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}