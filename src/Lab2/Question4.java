package Lab2;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Question4 {
    Question4(){
        Frame frame = new Frame();
        Choice c1 = new Choice();
        frame.setSize(600,600);
        frame.setLayout(new GridLayout(2,2));
        c1.add("C");
        c1.add("Java");
        c1.add("Python");
        c1.add("C++");
        c1.add("Dot Net");
        Label l1 = new Label("Which Language you like most?"+c1.getItemCount());
        Label l2 = new Label();
        l1.setSize(100,200);
        l2.setSize(100,200);
        frame.add(l1);
        frame.add(c1);
        frame.add(l2);
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l2.setText("You Selected: "+c1.getSelectedItem());
                c1.select(c1.getSelectedItem());
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question4();
    }
}
