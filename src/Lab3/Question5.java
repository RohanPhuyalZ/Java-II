package Lab3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question5 {
    Question5(){
        Frame frame = new Frame();
        Label l1 = new Label("Number 1");
        Label l2 = new Label("Number 2");
        TextField t1 = new TextField(8);
        TextField t2 = new TextField(8);
        Button b1 = new Button("Swap");
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                String temp = s2;
                s2=s1;
                s1=temp;

                t1.setText(s1);
                t2.setText(s2);
            }
        });
        frame.setSize(400,180);
        frame.setLayout(new GridLayout(3,2));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question5();
    }
}
