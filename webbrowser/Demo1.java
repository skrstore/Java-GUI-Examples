import java.awt.Color;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

class Demo1 {
	JFrame myFrame = null;

	public static void main(String[] args) {
		(new Demo1()).test1();
	}

	public void test1() {
		myFrame = new JFrame("Demo1");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400, 400);

		JEditorPane myPane;
		try {
			myPane = new JEditorPane("https://google.com");
			myPane.setBackground(Color.white);
			myPane.setEditable(false);
			myPane.setContentType("text/html");

			myPane.addHyperlinkListener(new HyperlinkListener() {
				public void hyperlinkUpdate(HyperlinkEvent e) {
					if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
						System.out.println(e.getURL());
						System.out.println(e.getDescription());
					}
				}
			});
			// myPane.setText("<h1 style='color: red;'>Hello World of the Swing</h1>");
			myFrame.setContentPane(myPane);
			myFrame.setVisible(true);
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}
