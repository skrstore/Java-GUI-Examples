import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

class ChangeTitleIcon {
	public static void main(String[] args) {
		JFrame jf1 = new JFrame("Change Title Icon");
		Image icon = Toolkit.getDefaultToolkit().getImage("../images/smile.png");

		jf1.setIconImage(icon);
		// jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setSize(400, 400);
		jf1.setLayout(null);
		jf1.setVisible(true);
	}
}
