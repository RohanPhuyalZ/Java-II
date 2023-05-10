package Lab2;

import java.awt.*;

public class Q10GridLayout {
    Q10GridLayout(){
        Frame f = new Frame("Grid Layout");
        Label l1 = new Label("Testing Grid Layout Manager");
        Button b1 = new Button("Grid");
        TextField t1 = new TextField();
        f.setLayout(new GridLayout(2, 2));
        f.add(l1);
        f.add(b1);
        f.add(t1);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q10GridLayout();
    }
}
