import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

class ChoiceDemo {
    public static void main(String[] args) {
        Frame f1 = new Frame("Choice Demo");
        Choice c1 = new Choice();
        c1.add("item1");
        c1.add("item2");
        c1.add("item3");
        c1.add("item4");
        c1.add("item5");
        f1.add(c1);
        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f1.setVisible(true);
    }
}