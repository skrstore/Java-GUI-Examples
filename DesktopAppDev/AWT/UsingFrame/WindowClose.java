import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowClose {
	public static void main(String[] args) {
		Frame f1 = new Frame();
		f1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f1.setVisible(true);
		f1.setSize(300, 300);
	}
}
