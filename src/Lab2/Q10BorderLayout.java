package Lab2;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q10BorderLayout {
    Q10BorderLayout(){
        Frame f = new Frame("Border Layout");
        Label l1 = new Label("Testing");
        Label l2 = new Label("Border");
        Label l3 = new Label("Layout");
        Label l4 = new Label("Manager");
        Label l5 = new Label("Hello");
        f.setLayout(new BorderLayout());
        f.add(l1,BorderLayout.NORTH);
        f.add(l2,BorderLayout.WEST);
        f.add(l3,BorderLayout.EAST);
        f.add(l4,BorderLayout.SOUTH);
        f.add(l5,BorderLayout.CENTER);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q10BorderLayout();
    }
}
