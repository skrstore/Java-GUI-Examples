import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowListenerDemo{
    public static void main(String[] args) {
        Frame f1 = new Frame("Window Listener Demo");

        f1.addWindowListener(new WindowListener(){
        
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }
        
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window I Configured");
            }
        
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window I Deconfigured");
            }
        
            @Override
            public void windowDeactivated(WindowEvent e) {
                
            }
        
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }
        
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }
        
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }
        });
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}