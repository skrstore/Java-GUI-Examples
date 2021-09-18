import javax.swing.JButton;
import javax.swing.JFrame;

// Creating a swing frame using Inheritance 
class UsingInheritance extends JFrame {
    private static final long serialVersionUID = 1L;

    UsingInheritance() {
        JButton jb1 = new JButton("Click Here");
        jb1.setBounds(50, 50, 150, 50);

        add(jb1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UsingInheritance();
    }
}