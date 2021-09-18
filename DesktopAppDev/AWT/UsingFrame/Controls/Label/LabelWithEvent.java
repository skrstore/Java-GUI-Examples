import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

class LabelWithEvent extends Frame implements ActionListener {
    private static final long serialVersionUID = 1L;

    TextField tf1;
    Label l1;
    Button b1;

    LabelWithEvent() {
        tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 30);
        l1 = new Label();
        l1.setBounds(50, 100, 250, 30);
        b1 = new Button("Find IP");
        b1.setBounds(50, 150, 60, 30);
        b1.addActionListener(this);
        add(tf1);
        add(l1);
        add(b1);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf1.getText();
            String ip = InetAddress.getByName(host).getHostAddress();
            l1.setText("IP of " + host + "is : " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new LabelWithEvent();
    }
}