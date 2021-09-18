import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// TODO: Implement ActionListener
// class ButtonActionTest1 implements ActionListener {
// public void actionPerformed(ActionEvent e) {
// System.out.println("Button is Clicked");
// }

// public static void main(String[] args) {
// Frame f1 = new Frame();
// Label l1 = new Label("Button Not Clicked");
// Button b1 = new Button("Click Here");
// b1.addActionListener(this);
// f1.add(l1);
// f1.add(b1);
// f1.setSize(400, 400);
// f1.setLayout(new FlowLayout(FlowLayout.CENTER));
// f1.setVisible(true);
// f1.addWindowListener(new WindowAdapter() {
// public void windowClosing(WindowEvent e) {
// System.exit(0);
// }
// });
// }
// }

// Using Anormous Class
class ButtonActionTest2 {
	public static void main(String[] args) {
		Frame f1 = new Frame();
		Label l1 = new Label("Button Not Clicked");
		Button b1 = new Button("Click Here");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setText("Button is Clicked");
			}
		});
		f1.add(l1);
		f1.add(b1);
		f1.setSize(400, 400);
		f1.setLayout(new FlowLayout(FlowLayout.CENTER));
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

// Using Lambda Expression
class ButtonActionTest3 {
	public static void main(String[] args) {
		Frame f1 = new Frame();
		Label l1 = new Label("Button Not Clicked");
		Button b1 = new Button("Click Here");
		b1.addActionListener((ActionEvent e) -> {
			l1.setText("Button is Clicked");
		});
		f1.add(l1);
		f1.add(b1);
		f1.setSize(400, 400);
		f1.setLayout(new FlowLayout(FlowLayout.CENTER));
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
