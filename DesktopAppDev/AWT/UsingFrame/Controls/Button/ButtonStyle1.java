import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

class ButtonStyleTest1 {
	public static void main(String[] args) {
		Frame f1 = new Frame();
		Button b1 = new Button("First Button");
		Font fo1 = new Font("Sans_Serif", Font.BOLD, 20);
		b1.setBounds(50, 100, 250, 60);
		b1.setBackground(Color.RED);
		b1.setFont(fo1);

		f1.add(b1);
		f1.setBackground(Color.YELLOW);
		f1.setLayout(null);
		f1.setSize(400, 400);
		f1.setVisible(true);
	}
}
