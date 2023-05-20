package Lab3;

import java.awt.*;
import java.awt.event.*;

public class Question2 implements ActionListener {
    Frame frame;
    Label l1;
    TextField t1;
    Button b1,b2,b3;
    Question2(){
        frame = new Frame("AWT Counter");
        frame.setLayout(new FlowLayout());
        l1 = new Label("Enter an integer");
        t1 = new TextField(8);
        b1 = new Button("Up");
        b2 = new Button("Down");
        b3 = new Button("Reset");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        frame.add(l1);
        frame.add(t1);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Up"){
            int value = Integer.parseInt(t1.getText());
            value++;
            t1.setText(""+value);
        }
        else if(e.getActionCommand()=="Down"){
            int value = Integer.parseInt(t1.getText());
            value--;
            t1.setText(""+value);
        }
        else {

            t1.setText("");
        }
    }
}
