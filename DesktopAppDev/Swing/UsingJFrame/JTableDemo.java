import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class JTableDemo{
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("JTable Demo");
        String[][] data  = {
            {"001", "Sachin","JAVA"},
            {"002", "Mradul", "DBMS"},
            {"003", "Vikas", "EC"}
        };

        String[] coloum = {"RollNo", "Name", "Subject With Back"};

        JTable jt1 = new JTable(data,coloum);
        JScrollPane jsp1 = new JScrollPane(jt1);

        jf1.add(jsp1);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400,400);
        jf1.setLayout(new FlowLayout());
        jf1.setVisible(true);
    }
}