import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JCheckBoxDemo{
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("CheckBox Demo");
        JLabel jl1 = new JLabel("NO Action Performed");
        JLabel jl2 = new JLabel();
        JCheckBox jcb1 = new JCheckBox("C");
        jf1.add(jcb1);
        jcb1.addItemListener(new ItemListener(){
        
            @Override
            public void itemStateChanged(ItemEvent e) {
                jl1.setText("C selected");
            }
        });
        jcb1 = new JCheckBox("JAVA");
        jf1.add(jcb1);
        jcb1.addItemListener(new ItemListener(){
        
            @Override
            public void itemStateChanged(ItemEvent e) {
                jl2.setText("JAVA Selected");
            }
        });
        
        jf1.add(jl1);
        jf1.add(jl2);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400,400);
        jf1.setLayout(new FlowLayout());
        jf1.setVisible(true);
    }
}