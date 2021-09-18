import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

class JTreeDemo {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("JTree Demo");

        DefaultMutableTreeNode sem5 = new DefaultMutableTreeNode("Sem5");
        DefaultMutableTreeNode JAVA = new DefaultMutableTreeNode("JAVA");
        DefaultMutableTreeNode Applet = new DefaultMutableTreeNode("Applet");
        DefaultMutableTreeNode Frame = new DefaultMutableTreeNode("Frame");
        DefaultMutableTreeNode DBMS = new DefaultMutableTreeNode("DBMS");
        DefaultMutableTreeNode SQL = new DefaultMutableTreeNode("SQL");
        DefaultMutableTreeNode NoSQL = new DefaultMutableTreeNode("NoSQL");

        sem5.add(JAVA);
        sem5.add(DBMS);
        JAVA.add(Applet);
        JAVA.add(Frame);
        DBMS.add(SQL);
        DBMS.add(NoSQL);

        JTree jt1 = new JTree(sem5);

        jf1.add(jt1);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400, 400);
        jf1.setLayout(new FlowLayout());
        jf1.setVisible(true);
    }
}