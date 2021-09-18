import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class CheckboxEvent1 {
	public static void main(String[] args) {
		Frame f1 = new Frame();
		Label l1 = new Label("Checkbox Status : ");
		Checkbox cb1 = new Checkbox("C++");
		Checkbox cb2 = new Checkbox("JAVA");

		l1.setAlignment(Label.CENTER);
		l1.setSize(400, 100);

		cb1.setBounds(100, 100, 50, 50);
		cb1.addItemListener((ItemEvent e) -> {
			l1.setText("C++ Checkbox : " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
		});

		cb2.setBounds(100, 150, 50, 50);
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				l1.setText("JAVA Checkbox : " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
			}
		});

		f1.add(l1);
		f1.add(cb1);
		f1.add(cb2);
		f1.setSize(400, 400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
