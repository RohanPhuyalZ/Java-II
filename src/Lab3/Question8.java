package Lab3;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Question8 implements KeyListener {
    Frame frame;
    Panel panel;
    Label l1, l2,l3;
    TextField t1,t2,t3;

    Question8(){
        frame = new Frame("Currency");
        panel = new Panel();
        panel.setLayout(new GridLayout(3,2));
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());
        frame.add(panel);

        l1= new Label("Dollar");
        l2= new Label("Nepalese");
        l3= new Label("Euro");
        t1= new TextField(10);
        t2= new TextField(10);
        t3= new TextField(10);

        t1.addKeyListener(this);
        t2.addKeyListener(this);
        t3.addKeyListener(this);

        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(l3);
        panel.add(t3);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question8();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource()==t1){
            double dollar = Double.parseDouble(t1.getText());
            t2.setText(""+(dollar*100));
            t3.setText(""+(dollar*1.30));
        }else if(e.getSource()==t2){
            double nrs = Double.parseDouble(t2.getText());
            t1.setText(""+(nrs/100));
            t3.setText(""+(nrs/130));
        }else if(e.getSource()==t3){
            double euro = Double.parseDouble(t3.getText());
            t1.setText(""+(euro/1.30));
            t2.setText(""+(euro*130));
        }
//        double dollar = Double.parseDouble(t1.getText());
//        double nrs = Double.parseDouble(t2.getText());
//        double euro = Double.parseDouble(t3.getText());

    }
}
