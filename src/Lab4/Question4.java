package Lab4;

import javax.swing.*;
import java.awt.*;

public class Question4 {
    Question4(){
        JFrame frame = new JFrame("Java Programming");
        JLabel l1 = new JLabel("Java Programming",JLabel.CENTER);
        JLabel l2 = new JLabel("Try it",JLabel.CENTER);
        ImageIcon i1 = new ImageIcon("Images\\java.png");
        JLabel l3 = new JLabel(i1);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.add(l1,BorderLayout.NORTH);
        frame.add(l3);
        frame.add(l2,BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question4();
    }
}
