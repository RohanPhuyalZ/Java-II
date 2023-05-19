package Lab3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Question9 implements KeyListener {
    Frame frame;
    Label l1,l2;
    TextField t1;

    Question9(){
        frame = new Frame("Key Event");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout( ));

         l1 = new Label("enter text");
         l2 = new Label("               ");
         t1 = new TextField(7);
         t1.addKeyListener(this);
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question9();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText(t1.getText());
    }
}
