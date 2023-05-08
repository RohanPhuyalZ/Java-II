package Lab2;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Question7 {
    Question7(){
        Frame frame = new Frame();
        Scrollbar sb1= new Scrollbar(Scrollbar.VERTICAL,0,1,0,50);
        Scrollbar sb2= new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,50);
        frame.setSize(600,600);
        frame.setLayout(new GridLayout(2,2,40,40));
        /* Label only for event handling, not needed in this lab */
        Label l1 = new Label("Vertical Value: "+sb1.getValue());
        Label l2 = new Label("Horizontal Value: "+sb2.getValue());
        sb1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l1.setText("Vertical Value: "+sb1.getValue());
            }
        });
        sb2.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l2.setText("Vertical Value: "+sb2.getValue());
            }
        });
        /* Event Finished*/
        frame.add(sb1);
        frame.add(sb2);
        frame.add(l1);
        frame.add(l2);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Question7();
    }
}
