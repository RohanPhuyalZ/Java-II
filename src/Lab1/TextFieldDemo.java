package Lab1;

import java.awt.*;

public class TextFieldDemo {
    TextFieldDemo(){
        Frame frame = new Frame("Hello World");
        frame.setSize(300,200);
        Label l1 = new Label("User ID");
        TextField t1 = new TextField();
        t1.setBounds(110,65,60,30);
        l1.setBounds(10,30,100,100);
        frame.add(l1);
        frame.add(t1);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
         new TextFieldDemo();
    }
}
