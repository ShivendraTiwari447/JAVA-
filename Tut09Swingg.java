import javax.swing.*;
import java.awt.event.*;

public class Tut09Swingg extends JFrame {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JButton b1, b2;

    Tut09Swingg(String s1) {
        super();

    }

    Tut09Swingg() {

    }

    void setComponents() {
        // JLabel l1 = new JLabel("welcome");
        // JTextField t1 = new JTextField();

        // setLayout(null);
        // l1.setBounds(350,40,100,30);
        // t1.setBounds(200,100,100,30);
        // add(t1);
        // add(l1);

        l1 = new JLabel("welcome to my page first login in");
        l2 = new JLabel("username");
        l3 = new JLabel("password");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Login");
        b2 = new JButton("Clear");

        setLayout(null);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);

        l1.setBounds(100, 50, 300, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 300, 30);
        l4.setBounds(100, 550, 300, 30);
        t1.setBounds(350, 200, 300, 30);
        t2.setBounds(350, 350, 300, 30);
        b1.setBounds(200, 450, 300, 30);
        b2.setBounds(400, 450, 300, 30);

        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());

    }

    public static void main(String[] args) {
        Tut09Swingg t1 = new Tut09Swingg("Welcome to my page");
        t1.setVisible(true);
        t1.setSize(700, 700);
        t1.setComponents();
        t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class Log implements ActionListener {

        public void actionPerformed(ActionEvent e1) {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if (s1.equals("shiv") && s2.equals("tiwari")) {
                l4.setText("looged in");
            } else {
                l4.setText("try again ");

            }
        }
    }
    class Clear implements ActionListener {

        public void actionPerformed(ActionEvent e1) {
           t1.setText("");
           t2.setText("");
        }
    }
}
