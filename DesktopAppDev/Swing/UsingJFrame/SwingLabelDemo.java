
// A simple Swing application.
import javax.swing.*;

class SwingLabelDemo {
	SwingLabelDemo() {
		JFrame jfrm = new JFrame("A Simple Swing Application");
		jfrm.setSize(400, 400);
		// jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlab = new JLabel(" Swing means powerful GUIs.");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingLabelDemo();
			}
		});
	}
}
