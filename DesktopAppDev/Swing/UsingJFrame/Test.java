import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class Test {
	public static void main(String args[]) {
		JFrame f1 = new JFrame("Test");
		// JLabel l1 = new JLabel("Hello");
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		// JButton b3 = new JButton("EAST");
		// JButton b4 = new JButton("WEST");
		// JButton b5 = new JButton("CENTER");

		b1.setSize(100, 100);
		b2.setSize(100, 100);
		f1.add(b1);
		f1.add(b2);
		// f1.add(b3);
		// f1.add(b4);
		// f1.add(b5);

		f1.setSize(400, 400);
		f1.setLayout(new BorderLayout(20, 20));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f1.setLocation(dim.width / 2 - f1.getSize().width / 2, dim.height / 2 - f1.getSize().height / 2);

		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}
}
