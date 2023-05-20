package Lab2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question12 {
    Question12(){
        Frame frame = new Frame();
        frame.setSize(200,200);
        frame.setLayout(new FlowLayout());
        Dialog d1 = new Dialog(frame,"Test",true);
        FileDialog d2 = new FileDialog(d1,"Open Fie",FileDialog.LOAD);
        d1.setSize(200,200);
        d1.setLayout(new FlowLayout());
        Button b2 = new Button("File");
        d1.add(b2);
        Button b1 = new Button("Dialog");
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2.setVisible(true);
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question12();
    }
}
