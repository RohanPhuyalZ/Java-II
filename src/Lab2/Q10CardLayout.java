package Lab2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q10CardLayout {
    Q10CardLayout(){
        Frame f = new Frame("Panel Layout");
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Button b1 = new Button("Card1");
        Button b2 = new Button("Card2");
        f.setLayout(new CardLayout());
        f.add(p1);
        f.add(p2);
        p1.add(b1);
        p2.add(b2);
        f.setSize(400,400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Q10CardLayout();
    }


}
