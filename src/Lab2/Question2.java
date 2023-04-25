package Lab2;

import java.awt.*;

public class Question2 {
    Frame frame;
    Button b1,b2,b3,b4;
    Question2(){
        frame = new Frame("Button Demo");
        frame.setLayout(new GridLayout(2,2));
        frame.setSize(300,300);
        b1= new Button("1");
        b2= new Button("2");
        b3= new Button("3");
        b4= new Button("4");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        b2.setEnabled(false);
        b4.setEnabled(false);

        frame.setVisible(true);
    }
    void setLabel(){
        b1.setLabel("One");
        b3.setLabel("Three");
    }
    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.setLabel();
    }
}
