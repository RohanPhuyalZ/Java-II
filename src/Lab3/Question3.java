package Lab3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question3 implements ActionListener {
    Frame frame;
    Button b1,b2,b3,b4;
    Question3(){
        frame = new Frame();
        b1= new Button("RED");
        b2= new Button("GREEN");
        b3= new Button("BLUE");
        b4= new Button("CLOSE");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="RED"){
            frame.setBackground(Color.RED);
        }else if(e.getActionCommand()=="GREEN"){
            frame.setBackground(Color.GREEN);
        }else if(e.getActionCommand()=="BLUE"){
            frame.setBackground(Color.BLUE);
        }else {
            System.exit(0);
        }
    }
}