package Lab2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q10CardEventHandle implements ActionListener {
    Frame f;
    Panel p1,p2,p3;
    Button b1,b2,b3;
    CardLayout card;

    Q10CardEventHandle(){
        f= new Frame("Card");
        p1= new Panel();
        p2= new Panel();
        p3= new Panel();
        card= new CardLayout();
        f.setSize(400,400);
        f.setLayout(card);

        b1= new Button("Rohan");
        b2= new Button("Don");
        b3= new Button("Ho");
        f.add(p1);
        f.add(p2);
        f.add(p3);
        p1.add(b1);
        p2.add(b2);
        p3.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(f);
//        System.out.println("Hello "+e.getActionCommand());
    }
    public static void main(String[] args) {
        new Q10CardEventHandle();
    }


}
