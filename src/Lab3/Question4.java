package Lab3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question4 {
    Question4(){
        Frame frame= new Frame();
        TextField t1= new TextField(10);
        Button b1 = new Button("Submit");
        Label l1 = new Label("              ",Label.RIGHT);
        l1.setSize(100,100);
        frame.add(t1);
        frame.add(b1);
        frame.add(l1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText(t1.getText());
            }
        });
        frame.setSize(500,400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Question4();
    }
}
