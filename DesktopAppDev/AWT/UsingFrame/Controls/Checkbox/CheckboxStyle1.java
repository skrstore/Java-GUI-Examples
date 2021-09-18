import java.awt.Checkbox;
import java.awt.Frame;

class CheckboxStyleTest1 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Checkbox Demo");
		Checkbox cb1 = new Checkbox("JAVA", true);
		Checkbox cb2 = new Checkbox("C++");

		cb1.setBounds(100, 100, 50, 50);
		cb2.setBounds(100, 150, 50, 50);

		f1.add(cb1);
		f1.add(cb2);
		f1.setSize(400, 400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
