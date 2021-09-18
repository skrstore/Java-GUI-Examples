import javax.swing.JButton;
import javax.swing.JFrame;

// Creating a Swing frame using the JFrame Object inside the constructor 
class UsingObjectInConstructor {
    UsingObjectInConstructor() {
        JFrame jf1 = new JFrame("Object In Constructor");

        JButton jb1 = new JButton("Click Here");
        jb1.setBounds(50, 50, 150, 50);

        jf1.add(jb1);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400, 400);
        jf1.setLayout(null);
        jf1.setVisible(true);
    }

    public static void main(String[] args) {
        new UsingObjectInConstructor();
    }
}