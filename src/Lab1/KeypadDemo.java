package Lab1;

import java.awt.*;

public class KeypadDemo {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    KeypadDemo(){
        Frame frame = new Frame("Keypad");
        frame.setSize(300,500);
        frame.setLayout(new GridLayout(4,3));
        b1= new Button("1");
        b2= new Button("2");
        b3= new Button("3");
        b4= new Button("4");
        b5= new Button("5");
        b6= new Button("6");
        b7= new Button("7");
        b8= new Button("8");
        b9= new Button("9");
        b10= new Button("*");
        b11= new Button("0");
        b12= new Button("#");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new KeypadDemo();
    }
}
