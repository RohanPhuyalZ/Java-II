package Lab1;

import java.awt.*;

public class NumberDemo {
    NumberDemo(){
        Frame frame = new Frame("Hello World");
        frame.setSize(400,400);
        Button b1 = new Button("One");
        b1.setBounds(120,130,50,30);
        Button b2 = new Button("Two");
        b2.setBounds(210,130,50,30);
        Button b3 = new Button("Three");
        b3.setBounds(120,180,50,30);
        Button b4 = new Button("Four");
        b4.setBounds(210,180,50,30);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        NumberDemo n1 = new NumberDemo();
    }
}
