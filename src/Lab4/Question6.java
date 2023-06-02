package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question6 implements ActionListener {
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    JFrame f;
    JPanel p;
    Question6(){
        f = new JFrame();
        p = new JPanel();
        f.setSize(500,500);
        f.setLayout(new GridLayout(3,1));
        p.setLayout(new GridLayout(2,2));

        l1= new JLabel("Who is the founder of JAVA",JLabel.CENTER);
        l2 = new JLabel("                          ",JLabel.CENTER);
        b1= new JButton("Dennis Ritchie");
        b2= new JButton("James Gosling");
        b3= new JButton("Guido Van Rossum");
        b4= new JButton("Patrick Naughton");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.add(l1);
        f.add(p);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        f.add(l2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Question6();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="James Gosling"){
            l2.setText("You are correct");
        }else{
            l2.setText("You are incorrect");
        }
    }
}
