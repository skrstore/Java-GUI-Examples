import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

class CheckboxGroupDemo {
    public static void main(String[] args) {
        Frame f1 = new Frame("CheckboxGroup Demo");
        CheckboxGroup cbg1 = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("JAVA", cbg1, true);
        Checkbox cb2 = new Checkbox("C++", cbg1, false);
        Checkbox cb3 = new Checkbox("JavaScript", cbg1, false);

        f1.add(cb1);
        f1.add(cb2);
        f1.add(cb3);
        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f1.setVisible(true);
    }
}