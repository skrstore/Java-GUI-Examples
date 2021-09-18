import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Test {
	public static void main(String[] args) {
		JFrame f = new JFrame("Test3");

		JButton b1 = new JButton("Center");
		b1.setSize(100, 100);

		JPanel p1 = new JPanel();
		p1.add(new JLabel("Hello in the world"));

		f.add(b1, BorderLayout.BEFORE_FIRST_LINE);
		f.add(p1, BorderLayout.CENTER);
		// f.add(new JButton("Button 2"),);
		// f.add(new JButton("Button 3"));
		// f.add(new JButton("Button 4"));

		// BorderLayout bl = new BorderLayout(30, 30);

		// f.setLayout(bl);
		f.repaint();
		f.pack();
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
