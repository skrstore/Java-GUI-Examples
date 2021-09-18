import javax.swing.JButton;
import javax.swing.JFrame;

// Creating a swing frame from JFrame Object inside the Main Method
class UsingObject {
    public static void main(String[] args) {
        // Creating an Object of the JFrame Class to create Frame
        JFrame jf1 = new JFrame("Using Object");

        JButton jb1 = new JButton("Click Here");
        jb1.setBounds(50, 50, 150, 50);

        jf1.add(jb1);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400, 400);
        jf1.setLayout(null);
        jf1.setVisible(true);
    }
}