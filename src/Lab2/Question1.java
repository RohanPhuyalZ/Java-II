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
        frame.setSize(400,300);
        b1= new Button("OK");
        b2= new Button("Cancel");
        frame.setLayout(new GridLayout(3,2));
        t1= new TextField();
        t2= new TextField();
        frame.setVisible(true);
    }
    void setText(){
        l1= new Label("Name");
        l2= new Label("Address");
        l1.setAlignment(Label.CENTER);
        l2.setAlignment(Label.CENTER);
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);
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
