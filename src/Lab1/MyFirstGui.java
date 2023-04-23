package Lab1;

import java.awt.*;
import java.awt.Frame;

public class MyFirstGui {
    MyFirstGui(){
        Frame frame = new Frame("My First GUI");
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        MyFirstGui g1= new MyFirstGui();
    }
}
