package Lab3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question1 {
    Question1(){
        Frame frame = new Frame("AWT Counter");
        frame.setLayout(new FlowLayout());
        Label l1 = new Label("Enter an integer");
        TextField t1 = new TextField(8);
        Button b1 = new Button("Count Down");
        frame.add(l1);
        frame.add(t1);
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(t1.getText());
                value--;
                t1.setText(""+value);
            }
        });
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question1();
    }
}
