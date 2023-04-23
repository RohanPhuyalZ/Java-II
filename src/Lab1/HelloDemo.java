package Lab1;

import java.awt.*;

public class HelloDemo {
    HelloDemo(){
        Frame frame = new Frame("Hello World");
        frame.setSize(600,200);
        Button b1 = new Button("Hello");
        b1.setBounds(10,100,50,30);
        frame.add(b1);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HelloDemo h1 = new HelloDemo();
    }
}
