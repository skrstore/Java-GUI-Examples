import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

class ActivatedHyperlinkListener implements HyperlinkListener {
	JEditorPane editorPane;
	String newUrlString = "";

	public ActivatedHyperlinkListener(JEditorPane editorPane) {
		this.editorPane = editorPane;
	}

	public void hyperlinkUpdate(HyperlinkEvent hyperlinkEvent) {
		HyperlinkEvent.EventType type = hyperlinkEvent.getEventType();
		final URL url = hyperlinkEvent.getURL();
		if (type == HyperlinkEvent.EventType.ENTERED) {
			System.out.println("URL: " + url);
		} else if (type == HyperlinkEvent.EventType.ACTIVATED) {
			System.out.println("Activated");

			Document doc = editorPane.getDocument();
			System.out.println(editorPane.getDocument());
			try {
				editorPane.setPage(url);
			} catch (IOException ioException) {
				System.out.println("Error following link, Invalid link");
				editorPane.setDocument(doc);
			}
		}
	}
}

public class Demo2 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("EditorPane Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			JEditorPane editorPane = new JEditorPane("http://www.google.com");
			editorPane.setEditable(false);

			// WebView browser = new WebView();
			// WebEngine webEngine = browser.getEngine();
			// webEngine.load("http://mySite.com");

			WebView browser = new WebView();
			WebEngine webEngine = browser.getEngine();
			webEngine.load(url);

			HyperlinkListener hyperlinkListener = new ActivatedHyperlinkListener(editorPane);
			editorPane.addHyperlinkListener(hyperlinkListener);

			JScrollPane scrollPane = new JScrollPane(editorPane);

			// Button and TextArea
			JButton b1 = new JButton("Search");
			JTextField tf1 = new JTextField(30);
			JPanel jp1 = new JPanel();
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(tf1.getText());
					tf1.setText("");
				}
			});
			jp1.add(tf1, BorderLayout.WEST);
			jp1.add(b1, BorderLayout.EAST);

			frame.add(jp1, BorderLayout.NORTH);
			frame.add(scrollPane, BorderLayout.CENTER);
		} catch (IOException e) {
			System.err.println("Unable to load: " + e);
		}

		frame.setSize(640, 480);
		frame.setVisible(true);
	}
}
