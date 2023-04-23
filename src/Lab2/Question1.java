package Lab2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question1 {
    Frame frame;
    Label l1,l2;
    Button b1,b2;
    TextField t1,t2;
    Question1(){
        frame = new Frame("Label Demo");
        frame.setSize(600,600);
        b1= new Button("OK");
        b2= new Button("Cancel");
        b1.setBounds(0,250,300,100);
        b2.setBounds(300,250,300,100);
        frame.add(b1);
        frame.add(b2);
        t1= new TextField();
        t2= new TextField();
        t1.setBounds(120,50,400,80);
        t2.setBounds(120,130,400,80);
        frame.add(t1);
        frame.add(t2);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    void setText(){
        l1= new Label("Name");
        l2= new Label("Address");
        l1.setBounds(10,10,100,100);
        l2.setBounds(10,100,100,100);
        l1.setAlignment(Label.CENTER);
        l2.setAlignment(Label.CENTER);
        frame.add(l1);
        frame.add(l2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Full Name");
            }
        });
    }
    public static void main(String[] args) {
        Question1 q1= new Question1();
        q1.setText();
    }
}
