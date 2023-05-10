package Lab2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q10BorderLayout {
    Q10BorderLayout(){
        Frame f = new Frame("Border Layout");
        Label l1 = new Label("Testing Border Layout Manager");
        Button b1 = new Button("Flow");
        TextField t1 = new TextField();
        f.setLayout(new BorderLayout(40,20));

        f.add(l1);
        f.add(b1);
        f.add(t1);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q10BorderLayout();
    }
}
