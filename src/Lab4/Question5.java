package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question5 {
    Question5(){
        JFrame f = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        f.setSize(500,500);
        f.setLayout(new GridLayout(3,1));

        p2.setLayout(new FlowLayout());
        p1.setLayout(new GridLayout(3,2));

        JLabel l1 = new JLabel("Find the largest one",JLabel.CENTER);
        JLabel l2 = new JLabel("First Number",JLabel.CENTER);
        JLabel l3 = new JLabel("Second Number",JLabel.CENTER);
        JLabel l4 = new JLabel("                      ",JLabel.CENTER);
        JButton b1 = new JButton("Check");
        JTextField t1 = new JTextField(8);
        JTextField t2 = new JTextField(8);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());

                if(n1>n2){
                    l4.setText(n1+" is largest");
                }else{
                    l4.setText(n2+" is largest");
                }
            }
        });

        f.add(l1);
        f.add(p1);
        p1.add(l2);
        p1.add(t1);
        p1.add(l3);
        p1.add(t2);
        p1.add(b1);
        f.add(l4);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Question5();
    }
}
