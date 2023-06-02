package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question7 {
    JFrame f;
    JPanel p;
    JLabel l;
    ImageIcon i1,i2;
    JToggleButton b;
    Question7(){
        f = new JFrame();
        f.setSize(500,500);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 400,60));

        i1 = new ImageIcon("images\\bulbout.png");
        i2 = new ImageIcon("images\\bulbin.png");
        l = new JLabel(i1);
        b= new JToggleButton("Off");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.isSelected()){
                    b.setText("On");
                    l.setIcon(i2);
                }else{
                    b.setText("Off");
                    l.setIcon(i1);
                }

            }
        });
        f.add(b);
        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Question7();
    }
}
