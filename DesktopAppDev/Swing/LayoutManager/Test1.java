import javax.swing.SpringLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;

public class Test1 {
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("SpringDemo2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = frame.getContentPane();
		SpringLayout layout = new SpringLayout();
		contentPane.setLayout(layout);

		JLabel label = new JLabel("Label: ");
		JTextField textField = new JTextField("Text field", 15);
		contentPane.add(label);
		contentPane.add(textField);

		layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, contentPane);

		layout.putConstraint(SpringLayout.WEST, textField, 5, SpringLayout.EAST, label);
		layout.putConstraint(SpringLayout.NORTH, textField, 5, SpringLayout.NORTH, contentPane);

		frame.pack();
		frame.setVisible(true);
		frame.setSize(300, 300);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
