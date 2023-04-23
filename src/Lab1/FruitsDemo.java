package Lab1;

import java.awt.*;

public class FruitsDemo {
    FruitsDemo(){
        Frame frame = new Frame("Hello World");
        frame.setSize(600,200);
        Button b1 = new Button("Apple");
        b1.setBounds(200,100,50,30);
        Button b2 = new Button("Orange");
        b2.setBounds(270,100,50,30);
        Button b3 = new Button("Guava");
        b3.setBounds(340,100,50,30);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FruitsDemo f1 = new FruitsDemo();
    }
}
