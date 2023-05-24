package Lab3;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Question10 implements MouseListener {
    Frame frame;
    Button b1;
    Label l1,l2;
    Question10(){
        frame= new Frame("MouseEvent");
        frame.setSize(400,400);
        l2= new Label();

        frame.add(l1);
        frame.add(b1);
        frame.add(l2);

        b1.addMouseListener(this);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question10();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l2.setText("Mouse Clicked: "+e.getX()+","+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
